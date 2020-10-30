import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";
import { AccueilComponent } from './Components/accueil/accueil.component';
import {RouterModule} from '@angular/router';
import { PrendreRDVComponent } from './Components/prendre-rdv/prendre-rdv.component';
import {Ng2CompleterModule} from "ng2-completer";

@NgModule({
  declarations: [
    AppComponent,
    AccueilComponent,
    PrendreRDVComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule,
    Ng2CompleterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
