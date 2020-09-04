import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { ParentComponent } from './parent.component';

@NgModule({
  declarations: [
    ParentComponent, ChildComponent, Child2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [ParentComponent]
})
export class AppModule { }
