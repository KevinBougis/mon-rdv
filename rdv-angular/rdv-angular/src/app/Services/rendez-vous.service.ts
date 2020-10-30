import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {RendezVous} from "../Model/RendezVous";

@Injectable({
  providedIn: 'root'
})
export class RendezVousService {
  private rdvs:Array<RendezVous> = new Array<RendezVous>();
  constructor(private http:HttpClient) {
    this.load();
  }

  load() {
    this.http.get<Array<RendezVous>>("http://localhost:8080/api/rdv").subscribe(resp => {
      this.rdvs = resp;
    }, error => console.log(error))
  }

  findAll(): Array<RendezVous> {
    return this.rdvs;
  }

  findById(id: number): Observable<RendezVous> {
    return this.http.get<RendezVous>("http://localhost:8080/api/rdv/" + id);
  }

  create(rdv: RendezVous) {
    return this.http.post<RendezVous>("http://localhost:8080/api/rdv", rdv);
  }

  modify(rdv: RendezVous) {
    return this.http.put<RendezVous>("http://localhost:8080/api/rdv/" + rdv.id, rdv);
  }

  deleteById(id: number) {
    this.http.delete("http://localhost:8080/api/rdv/" + id).subscribe(resp => this.load(), error => console.log(error))
  }
}
