import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AccueilComponent} from './Components/accueil/accueil.component';
import {PrendreRDVComponent} from "./Components/prendre-rdv/prendre-rdv.component";

const routes: Routes = [
  {path: '', redirectTo: 'monRDV/accueil', pathMatch: 'full'},
  {path: 'monRDV/accueil', component: AccueilComponent},
  {path: 'monRDV/prendreRDV', component: PrendreRDVComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


