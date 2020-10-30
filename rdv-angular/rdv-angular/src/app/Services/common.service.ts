import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private http: HttpClient) { }


  findAllTypeUtilisateur(): Observable<Array<string>> {
    return this.http.get<Array<string>>('http://localhost:8080/api/typeUtilisateur');
  }
}
