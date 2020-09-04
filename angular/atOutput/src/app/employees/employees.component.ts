import {Component, Output, EventEmitter} from '@angular/core';
@Component({
    selector: 'my-emp',
    templateUrl :'employees.component.html',
    styleUrls: ['employees.component.css']
})

export class EmployeesComponent{
    title: string= "Employees List";
    employees=  [
        {
            id : 1 ,
            name :"honey",
            selected : false
        },
        {
            id : 2,
            name : "Yo YO",
            selected : false
        }
    ];
    @Output() itemClicked: EventEmitter<string>= new EventEmitter<string>();

    onClick(item: any)
    {
        for(let i=0; i<this.employees.length; i++)
            this.employees[i].selected=false;
        this.employees[item.id - 1].selected = true;
        this.itemClicked.emit(item.name);
    }
}