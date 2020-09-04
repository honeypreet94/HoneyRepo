import {Component,OnInit} from '@angular/core';
import {EmployeeserviceService} from './employeeservice.service';

@Component({
    selector: 'my-emp',
    templateUrl: 'employees.component.html'
})

export class EmployeesComponent{
    title: string='Employees List';
    employees: any[];

    constructor(private _employeeService: EmployeeserviceService){ }

    ngOnInit(){
        this.employees=this._employeeService.getEmployees();
    }
}