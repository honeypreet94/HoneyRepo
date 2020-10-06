import {Component, Input, OnInit} from '@angular/core';
import {MyServiceService} from './my-service.service';
import { Router } from '@angular/router';
import {ActivatedRoute,Params} from "@angular/router";

@Component({
    selector: 'emp_list',
    templateUrl: 'employeeList.component.html'
})
export class EmployeeListComponent implements OnInit{
    title = "Employee Details";
    id:any;
    employeeDetail;
    constructor(private employeeService:MyServiceService,private router: Router,private route: ActivatedRoute){
     
    }

    ngOnInit():void{
        
       // this.route.params.forEach((params: Params) => { this.id =+params['id']});
       this.route.params.subscribe(params=> {this.id=params['id']});
        console.log(this.id);
        this.employeeService.getEmployee(this.id).subscribe((data : any[])=>{
            console.log(data);
            this.employeeDetail = data;
        })
    }

    goBack():void{
        this.router.navigate(['/employees']);
    }

}