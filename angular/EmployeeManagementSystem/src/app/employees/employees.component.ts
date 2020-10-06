import {Component, Input, OnInit} from '@angular/core';
import {MyServiceService} from './my-service.service';
import { Router } from '@angular/router';

@Component({
    selector: 'my-emp',
    templateUrl: 'employees.component.html'
})

export class EmployeesComponent implements OnInit{
    title = "Employee List";
    nameFilter: string='';
    filterMetadata= {count: 0};
    employeeDetail;
    employee;
    constructor(private employeeService:MyServiceService,private router: Router){}
    
    employees:any[]=[];
    get sortData() {
        return this.employees.sort((a, b) => {
          return <any>a.id - <any>b.id;
        });
    }



    ngOnInit(){
        this.employeeService.getEmployees().subscribe((data : any[])=>{
            console.log(data);
            this.employees = data;
        })
    }

    edit(employee:any):void
    {   
            window.localStorage.removeItem("editEmployeeId");
           
            window.localStorage.setItem("editEmployeeId",employee.id.toString());
            
        this.router.navigate(['/updateemployee/{employee.id}']);

    }

    delete(employee:any):void{
        this.employeeService.deleteEmployee(employee.id).subscribe((ret)=>{
            console.log("Policy deleted: ", ret);     
      });

     // this.router.navigate(['/addemployee']);
      this.router.routeReuseStrategy.shouldReuseRoute= () => false;
      this.router.onSameUrlNavigation= 'reload';
      this.router.navigate(['/employees']);
    }
}