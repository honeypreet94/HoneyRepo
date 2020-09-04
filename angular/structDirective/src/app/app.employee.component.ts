import {Component} from '@angular/core';

@Component ({
    selector: 'my-emp',
    templateUrl: 'employee.component.html'
})

export class EmployeeComponent{
    title: string='Employee List';
    employees:any[]= [
        {
            "empid":1,
            "name":"Ram",
            "location":"Nepal"
        },
        {
            "empid":2,
            "name":"Honey",
            "location":"Punjab"
        }
    ];
}