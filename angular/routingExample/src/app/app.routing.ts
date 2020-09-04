import {Routes,RouterModule} from '@angular/router';
import {AboutComponent} from './about/about.component';
import {EmployeesComponent} from './employees/employees.component';
import {EmployeeComponent} from './employees/employee.component';
import { Component } from '@angular/core';

const appRoutes: Routes= [
    {path: '', component: AboutComponent},
    {path: 'employees', component: EmployeesComponent},
    {path: 'employees/:id', component: EmployeeComponent}
];

export const routing = RouterModule.forRoot(appRoutes);