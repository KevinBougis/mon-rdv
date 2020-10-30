import { Component, OnInit } from '@angular/core';
import {CompteUtilisateur} from "../../Model/CompteUtilisateur";
import {CommonService} from "../../Services/common.service";
import {CompteUtilisateurService} from "../../Services/compte-utilisateur.service";

@Component({
  selector: 'app-prendre-rdv',
  templateUrl: './prendre-rdv.component.html',
  styleUrls: ['./prendre-rdv.component.scss']
})
export class PrendreRDVComponent implements OnInit {
  praticienList: Array<CompteUtilisateur> = new Array<CompteUtilisateur>();
  nomPraticien : string='';
  nomPraticienList:Array<String>=new Array<String>();

  constructor(private commonService:CommonService,private compteUtilisateurService:CompteUtilisateurService) {

  this.compteUtilisateurService.findByTypeUtilisateur("Praticien").subscribe(resp => {
      this.compteUtilisateurService.users = resp;
    }, error => console.log(error));

    for(let praticien of this.compteUtilisateurService.findAll()){
        this.nomPraticienList.push(praticien.nom);
      }

  }


  ngOnInit(): void {
  }

  list(): Array<CompteUtilisateur> {
    console.log(this.compteUtilisateurService.findAll());
    return this.compteUtilisateurService.findAll();
  }
}
