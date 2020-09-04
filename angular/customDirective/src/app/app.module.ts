import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {SharedModule} from './shared/shared.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {UnderLineDirective} from './app.directive';

@NgModule({
  declarations: [
    AppComponent,
    UnderLineDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
