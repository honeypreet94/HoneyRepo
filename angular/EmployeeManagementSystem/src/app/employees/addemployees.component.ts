import {Component} from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';
 import {MyServiceService} from './my-service.service';
 import { Router } from '@angular/router';

@Component({
    selector: 'add-emp',
    templateUrl: 'addemployees.component.html',
    styleUrls: ['addemployees.component.css']
})

export class AddEmployeesComponent{
    title= "Add Employee";
    formdata;

    constructor(private employeeService:MyServiceService,private router: Router){}
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
                Validators.required,
              //  Validators.pattern('[a-zA-Z ]*')
            ]))

            
            
        });
    }
    onClickSubmit(data) {
        this.employeeService.createEmployee(data).subscribe((ret)=>{
           console.log("Employee created" + data.name);
      });

      this.router.navigate(['/employees']);

    

    }
}