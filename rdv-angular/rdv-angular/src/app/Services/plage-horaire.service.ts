import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {PlageHoraire} from "../Model/PlageHoraire";

@Injectable({
  providedIn: 'root'
})
export class PlageHoraireService {
  private plages:Array<PlageHoraire> = new Array<PlageHoraire>();
  constructor(private http:HttpClient) {
    this.load();
  }

  load() {
    this.http.get<Array<PlageHoraire>>("http://localhost:8080/api/plage").subscribe(resp => {
      this.plages = resp;
    }, error => console.log(error))
  }

  findAll(): Array<PlageHoraire> {
    return this.plages;
  }

  findById(id: number): Observable<PlageHoraire> {
    return this.http.get<PlageHoraire>("http://localhost:8080/api/plage/" + id);
  }

  create(plage: PlageHoraire) {
    return this.http.post<PlageHoraire>("http://localhost:8080/api/plage", plage);
  }

  modify(plage: PlageHoraire) {
    return this.http.put<PlageHoraire>("http://localhost:8080/api/plage/" + plage.id, plage);
  }

  deleteById(id: number) {
    this.http.delete("http://localhost:8080/api/plage/" + id).subscribe(resp => this.load(), error => console.log(error))
  }
}
