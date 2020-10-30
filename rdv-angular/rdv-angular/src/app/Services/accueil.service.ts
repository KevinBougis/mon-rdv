import {HttpClient} from '@angular/common/http';
import {CompteUtilisateur} from '../Model/CompteUtilisateur';

export class AccueilService {

  private utilisateur: CompteUtilisateur;
  private utilisateurs: Array<CompteUtilisateur> = new Array<CompteUtilisateur>();


  constructor(private http: HttpClient) {
    this.load();
  }

  load(): void {
    this.http.get<Array<CompteUtilisateur>>('http://localhost:8080/CompteUtilisateur').subscribe(resp => {
      this.utilisateurs = resp;
    }, error => console.log(error));
  }
}
