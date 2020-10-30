import { Injectable } from '@angular/core';
import {CompteUtilisateur} from "../Model/CompteUtilisateur";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CompteUtilisateurService {

  public users:Array<CompteUtilisateur> = new Array<CompteUtilisateur>();
  constructor(private http:HttpClient) {
this.load();
  }

  load() {
    this.http.get<Array<CompteUtilisateur>>("http://localhost:8080/api/user").subscribe(resp => {
      this.users = resp;
    }, error => console.log(error))
  }

  findAll(): Array<CompteUtilisateur> {
    return this.users;
  }

  findById(id: number): Observable<CompteUtilisateur> {
    return this.http.get<CompteUtilisateur>("http://localhost:8080/api/user/" + id);
  }

  create(user: CompteUtilisateur) {
    return this.http.post<CompteUtilisateur>("http://localhost:8080/api/user", user);
  }

  modify(user: CompteUtilisateur) {
    return this.http.put<CompteUtilisateur>("http://localhost:8080/api/user/" + user.id, user);
  }

  deleteById(id: number) {
    this.http.delete("http://localhost:8080/api/user/" + id).subscribe(resp => this.load(), error => console.log(error))
  }

  findBySpecialite(specialite: string): Observable<Array<CompteUtilisateur>> {
    return this.http.get<Array<CompteUtilisateur>>('http://localhost:8080/api/user/by-Specialite/' + specialite);
  }

  findByTypeUtilisateur(typeUtilisateur: string): Observable<Array<CompteUtilisateur>> {
    return this.http.get<Array<CompteUtilisateur>>('http://localhost:8080/api/user/by-TypeUtilisateur/' + typeUtilisateur);
  }
}
