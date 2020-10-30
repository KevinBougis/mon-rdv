import { BrowserModule } from '@angular/platform-browser';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSelectModule} from '@angular/material/select';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AccueilComponent } from './Components/accueil/accueil.component';
import {RouterModule} from '@angular/router';
import {NgModule} from '@angular/core';

@NgModule({
  declarations: [
    AppComponent,
    AccueilComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule,
    MatButtonToggleModule,
    MatSelectModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

// ERROR in The target entry-point "@angular/material/button-toggle" has missing dependencies:
//   - @angular/cdk/a11y
//   - @angular/cdk/coercion
//   - @angular/cdk/collections
