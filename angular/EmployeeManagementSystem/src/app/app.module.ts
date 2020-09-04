import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {EmployeesComponent} from './employees/employees.component';
import {AddEmployeesComponent} from './employees/addemployees.component';
import {EmployeeListComponent} from './employees/employeeList.component';

import {EmployeeFilterPipe} from './app.pipe';
import {HttpClientModule} from '@angular/common/http';
import {HttpClientInMemoryWebApiModule} from 'angular-in-memory-web-api'; 
import {DataService} from './employees/data.service';

 
@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    AddEmployeesComponent,
    EmployeesComponent,
    EmployeeFilterPipe,
    EmployeeListComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    HttpClientInMemoryWebApiModule.forRoot(DataService)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
