import {Component,OnInit} from '@angular/core';
import {ActivatedRoute,Params} from "@angular/router";
import {Location} from "@angular/common";
import {map} from 'rxjs/Operators';
//import "rxjs/add/operator/map";

@Component({
    templateUrl: 'employee.component.html'
})

export class EmployeeComponent implements OnInit{

    id:any;
    constructor(private route: ActivatedRoute,private location:Location)
    {

    }

    ngOnInit():void{
        this.route.params.forEach((params: Params) => { this.id =+params['id']});
    }

    goBack(): void{
        this.location.back();
    }
}