import {Component, Input} from '@angular/core';

@Component({
    selector: 'my-emp',
    templateUrl: 'employees.component.html'
})

export class EmployeesComponent {
    title: string = "Employees List";
    @Input() companyName: string;
}