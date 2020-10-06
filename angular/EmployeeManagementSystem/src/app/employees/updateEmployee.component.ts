import {Component} from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';
 import {MyServiceService} from './my-service.service';
 import { Router } from '@angular/router';
 import {ActivatedRoute,Params} from "@angular/router";

@Component({
    selector: 'edit-emp',
    templateUrl: 'updateEmployee.component.html'
    //styleUrls: ['updateEmployee.component.css']
})

export class UpdateEmployeeComponent{
    title= "Add Employee";
    formdata;
    id;
    employeeDetail;
    constructor(private employeeService:MyServiceService,private router: Router,private route: ActivatedRoute){}
    ngOnInit(){
        this.formdata = new FormGroup({
            name: new FormControl("", Validators.compose([
                Validators.minLength(3),
                Validators.maxLength(30),
                Validators.required,
                Validators.pattern('[a-zA-Z ]*')
            ])),
            email: new FormControl("", Validators.compose([
                Validators.required,
                Validators.pattern("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]")
             ])),
             mobile: new FormControl("", Validators.compose([
                Validators.minLength(10),
                Validators.maxLength(10),
                Validators.required,
                Validators.pattern('[0-9]*')
            ])),
           location: new FormControl("", Validators.compose([
              //  Validators.minLength(3),
               // Validators.maxLength(30),
                Validators.required
              //  Validators.pattern('[a-zA-Z ]*')
            ]))
        });

         this.id=window.localStorage.getItem("editEmployeeId");
        
        //this.route.params.subscribe(params=> {this.id=params['id']});
          this.employeeService.getEmployee(this.id).subscribe((data : any[])=>{
            console.log(data);
            this.employeeDetail = data;
            console.log(this.employeeDetail.name);
        });

    }
   onClickSubmit(data) {
      // let newPolicy:{id: number, amount: number, clientId: number, userId: number, description: string} = {policy.id, 0, 0, 0};
      console.log("data" + data.name);  
      let empname=data.name;
      let newEmp={name:data.name,location:data.location,email:data.email,mobile:data.mobile};
      console.log("newWmp" + newEmp.name);
      this.employeeService.updateEmployee(this.id,data).subscribe((ret)=>{
              console.log("Employee updated: ", ret);
        });

        
      this.router.navigate(['/employees']);

    

    }


}