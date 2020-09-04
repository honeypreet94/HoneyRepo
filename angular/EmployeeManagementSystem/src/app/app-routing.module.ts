import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeesComponent } from './employees/addemployees.component';
import {EmployeesComponent} from './employees/employees.component'; 
import { EmployeeListComponent } from './employees/employeeList.component';

const routes: Routes = [
  {path:"employees", component:EmployeesComponent},
  {path:"addemployee", component:AddEmployeesComponent},
  {path:"employeeById",component:EmployeeListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { } 
export const
RoutingComponent=[EmployeesComponent,AddEmployeesComponent,EmployeeListComponent];
