import {Injectable} from '@angular/core';
import {HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import {map} from 'rxjs/Operators';

@Injectable()
export class EmployeeService{
    private _employeeUrl="/assets/employee.json";

    constructor(private _http:HttpClient){
        this.getEmployees().subscribe(data => {
            console.log(data);
        });
    }

    getEmployees(): Observable<any>
    {
        console.log(this._http.get(this._employeeUrl));
        return this._http.get(this._employeeUrl, {responseType: 'json'});
        
    }
}