import { Component, OnInit } from '@angular/core';
import {CompteUtilisateur} from '../../Model/CompteUtilisateur';
import {Router} from '@angular/router';
// import {AccueilService} from '../../Services/accueil.service';
// import {SessionService} from '../../Services/session.service';

@Component({
  selector: 'app-accueil-component',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.scss']
})
export class AccueilComponent implements OnInit {
  userForm: CompteUtilisateur = new CompteUtilisateur();

  constructor(

    // , private sessionService: SessionService
  ) {
  }

  ngOnInit(): void {
  }

  // show(): void {
  //   console.log(this.userForm);
  // }
  //
  // add(): void {
  //   this.userForm = new CompteUtilisateur();
  //
  // }
  //
  // type(): void {
  //   if (this.userForm.typeUtilisateur === 'Patient') {
  //     this.userForm = new CompteUtilisateur(null, null, this.userForm.typeUtilisateur);
  //     console.log(this.userForm);
  //     console.log(this.userForm.typeUtilisateur);
  //   } else if (this.userForm.typeUtilisateur === 'Praticien') {
  //     this.userForm = new CompteUtilisateur(null, null, this.userForm.typeUtilisateur);
  //     console.log(this.userForm.typeUtilisateur);
  //   }
  // }

  // save(userForm): void {
  //     this.accueilService.newUser(this.userForm).subscribe(resp => {
  //         this.accueilService.load();
  //         this.userForm = null;
  //       },
  //       error => console.log(error)
  //     )
  //     ;
  //   }

  // connexion() {
  //   console.log(this.userForm);
  //   this.accueilService.authentification(this.userForm).subscribe(resp => {
  //     console.log(resp);
  //     if (resp) {
  //       this.userForm = resp;
  //       this.sessionService.setUser(this.userForm);
  //       // sessionStorage.setItem('user', JSON.stringify(this.userForm))
  //       if (this.userForm.typeUtilisateur == 'Patient') {
  //         this.router.navigate(['monRDV/prendreRDV']);
  //       } else if (this.userForm.typeUtilisateur == 'Praticien') {
  //         this.router.navigate(['ACCUEIL PRATICIEN']);
  //       console.log(this.sessionService.getUser());
  //     } else {
  //       this.userForm = new CompteUtilisateur();
  //     }
  //     // console.log(sessionStorage.getItem('user'))
  //     // console.log(JSON.parse(sessionStorage.getItem('user')))
  //   }, err => console.log(err));
  // }

}
