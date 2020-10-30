import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {CreneauHoraire} from "../Model/CreneauHoraire";

@Injectable({
  providedIn: 'root'
})
export class CreneauHoraireService {
  private creneaux:Array<CreneauHoraire> = new Array<CreneauHoraire>();
  constructor(private http:HttpClient) {
    this.load();
  }


  load() {
    this.http.get<Array<CreneauHoraire>>("http://localhost:8080/api/creneauHoraire").subscribe(resp => {
      this.creneaux = resp;
    }, error => console.log(error))
  }

  findAll(): Array<CreneauHoraire> {
    return this.creneaux;
  }

  findById(id: number): Observable<CreneauHoraire> {
    return this.http.get<CreneauHoraire>("http://localhost:8080/api/creneauHoraire/" + id);
  }

  create(creneau: CreneauHoraire) {
    return this.http.post<CreneauHoraire>("http://localhost:8080/api/creneauHoraire", creneau);
  }

  modify(creneau: CreneauHoraire) {
    return this.http.put<CreneauHoraire>("http://localhost:8080/api/creneauHoraire/" + creneau.id, creneau);
  }

  deleteById(id: number) {
    this.http.delete("http://localhost:8080/api/creneauHoraire/" + id).subscribe(resp => this.load(), error => console.log(error))
  }
}
