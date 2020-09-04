import { Input,Component,SimpleChange, OnInit, OnChanges, OnDestroy } from '@angular/core';


@Component({
    selector: 'my-emp',
    templateUrl: 'employees.component.html'
})

export class EmployeesComponent implements OnInit, OnChanges, OnDestroy {
    title: String="Employees List";
    @Input() companyName: string;
    @Input() locationInfo: string;

    ngOnInit()
    {
        console.log("onInit of EmployeesComponent");
    }

    ngOnChanges(changes: {[propertyName: string]: SimpleChange})
    {
        for(let propName in changes)
        {
            let chng= changes[propName];
            let cur= JSON.stringify(chng.currentValue);
            let prev= JSON.stringify(chng.previousValue);
            let first= JSON.stringify(chng.isFirstChange());
            console.log(`onChanges ==> ${propName}: currentValue= ${cur}, previousValue= ${prev},
            firstChange= ${first}`);
        }
    }

    ngOnDestroy()
    {
        console.log(' OnDestroy of Employees Component');
    }
}




/*
class SimpleChange{
    Constructor(previousValue: any, currentValue: any)
    previousValue: any
    currentValue: any
    isFirstChange() : boolean
}
*/