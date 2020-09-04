import {Component, Input, OnInit} from '@angular/core';
import {MyServiceService} from './my-service.service';
@Component({
    selector: 'my-emp',
    templateUrl: 'employees.component.html'
})

export class EmployeesComponent implements OnInit{
    title = "Employee List";
    nameFilter: string='';
    filterMetadata= {count: 0};

    constructor(private employeeService:MyServiceService){}
    
    employees:any[]=[];
    get sortData() {
        return this.employees.sort((a, b) => {
          return <any>a.id - <any>b.id;
        });
    }

    get descSortData() {
        return this.employees.sort((a, b) => {
          return <any>b.id - <any>a.id;
        });
    }

    ngOnInit(){
        this.employeeService.getEmployees().subscribe((data : any[])=>{
            console.log(data);
            this.employees = data;
        })
    }
}