import {Component, Input, OnInit} from '@angular/core';
import {MyServiceService} from './my-service.service';
@Component({
    selector: 'emp_list',
    templateUrl: 'employeeList.component.html'
})
export class EmployeeListComponent implements OnInit{
    title = "Employee Details";

    constructor(private employeeService:MyServiceService){}

    ngOnInit(){
       // this.employeeService.getEmployee(data.id).subscribe((data : any[])=>{
            
       // })
    }

}