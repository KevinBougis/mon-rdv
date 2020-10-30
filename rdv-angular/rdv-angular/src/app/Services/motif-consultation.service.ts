import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {MotifConsultation} from "../Model/MotifConsultation";

@Injectable({
  providedIn: 'root'
})
export class MotifConsultationService {
  private motifs:Array<MotifConsultation> = new Array<MotifConsultation>();
  constructor(private http:HttpClient) {
    this.load();
  }

  load() {
    this.http.get<Array<MotifConsultation>>("http://localhost:8080/api/motif").subscribe(resp => {
      this.motifs = resp;
    }, error => console.log(error))
  }

  findAll(): Array<MotifConsultation> {
    return this.motifs;
  }

  findById(id: number): Observable<MotifConsultation> {
    return this.http.get<MotifConsultation>("http://localhost:8080/api/motif/" + id);
  }

  create(motif: MotifConsultation) {
    return this.http.post<MotifConsultation>("http://localhost:8080/api/motif", motif);
  }

  modify(motif: MotifConsultation) {
    return this.http.put<MotifConsultation>("http://localhost:8080/api/motif/" + motif.id, motif);
  }

  deleteById(id: number) {
    this.http.delete("http://localhost:8080/api/motif/" + id).subscribe(resp => this.load(), error => console.log(error))
  }
}
