import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Lieu} from "../Model/Lieu";

@Injectable({
  providedIn: 'root'
})
export class LieuService {
  private lieux:Array<Lieu> = new Array<Lieu>();
  constructor(private http:HttpClient) {
    this.load();
  }


  load() {
    this.http.get<Array<Lieu>>("http://localhost:8080/api/lieu").subscribe(resp => {
      this.lieux = resp;
    }, error => console.log(error))
  }

  findAll(): Array<Lieu> {
    return this.lieux;
  }

  findById(id: number): Observable<Lieu> {
    return this.http.get<Lieu>("http://localhost:8080/api/lieu/" + id);
  }

  create(lieu: Lieu) {
    return this.http.post<Lieu>("http://localhost:8080/api/lieu", lieu);
  }

  modify(lieu: Lieu) {
    return this.http.put<Lieu>("http://localhost:8080/api/lieu/" + lieu.id, lieu);
  }

  deleteById(id: number) {
    this.http.delete("http://localhost:8080/api/lieu/" + id).subscribe(resp => this.load(), error => console.log(error))
  }
}
