import { Component } from '@angular/core';
import {EmployeeserviceService} from './employees/employeeservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'servicesExample';

  constructor(private _employeeService: EmployeeserviceService){ }

    ngOnInit(){
        this.employees=this._employeeService.getEmployees();
    }
}
