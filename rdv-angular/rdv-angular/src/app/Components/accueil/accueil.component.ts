import { Component, OnInit } from '@angular/core';
import {CompteUtilisateur} from '../../Model/CompteUtilisateur';
import {Router} from '@angular/router';
import {CompteUtilisateurService} from '../../Services/compte-utilisateur.service';
import {AccueilService} from '../../Services/accueil.service';
// import {SessionService} from '../../Services/session.service';
declare var $: any;

@Component({
  selector: 'app-accueil-component',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.scss']
})
export class AccueilComponent implements OnInit {
  userForm: CompteUtilisateur = new CompteUtilisateur();

  constructor(
    // private accueilService: AccueilService,
    private compteUtilisateurService: CompteUtilisateurService
    // , private sessionService: SessionService
  ) {
  }

  ngOnInit(): void {
  }




  type(): void {
    if (this.userForm.typeUtilisateur === 'Patient') {
      this.userForm = new CompteUtilisateur(null, null, this.userForm.typeUtilisateur);
      console.log(this.userForm);
      console.log(this.userForm.typeUtilisateur);
    } else if (this.userForm.typeUtilisateur === 'Praticien') {
      this.userForm = new CompteUtilisateur(null, null, this.userForm.typeUtilisateur);
      console.log(this.userForm.typeUtilisateur);
    }
    $('#choixinscription').modal('hide');
  }

  save(): void {
      this.compteUtilisateurService.create(this.userForm).subscribe(resp => {
          this.compteUtilisateurService.load();
          this.userForm = null;
        },
        error => console.log(error)
      )
      ;
    }

}
