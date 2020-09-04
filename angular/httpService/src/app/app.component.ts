import { Component } from '@angular/core';
import {EmployeeService} from './employee.service'
//import {Employee} from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'httpService';
  public employees= [];

  constructor(private _employeeService: EmployeeService){}

  ngOnInit(){
    this._employeeService.getEmployees().subscribe(employees => this.employees = 
      Array.from(Object.keys(employees),k=> employees[k]));

      console.log(this.employees);
  }
}
