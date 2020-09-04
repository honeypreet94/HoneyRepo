import {Component} from '@angular/core';

@Component({
    templateUrl: 'employees.component.html'
})

export class EmployeesComponent{
    title: String ="employees list";
    employees=[
        {
            id:1,
            name: "honey"
        },
        {
            id: 2,
            name: "Yo"
        }   
    ];
}