import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeesComponent } from './employees/addemployees.component';
import {EmployeesComponent} from './employees/employees.component'; 
import { EmployeeListComponent } from './employees/employeeList.component';
import { UpdateEmployeeComponent } from './employees/updateEmployee.component';

const routes: Routes = [
  {path:"employees", component:EmployeesComponent},
  {path:"addemployee", component:AddEmployeesComponent},
  {path:"employeeById/:id",pathMatch:'prefix' ,component:EmployeeListComponent},
  {path:"updateemployee/:id", component:UpdateEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { } 
export const
RoutingComponent=[EmployeesComponent,AddEmployeesComponent,EmployeeListComponent,UpdateEmployeeComponent];
