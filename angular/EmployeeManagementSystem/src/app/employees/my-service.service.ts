import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MyServiceService {

  constructor(private httpClient: HttpClient) { }

  serverUrl:string = "http://localhost:8080/api/";

  public getEmployees(){ 
    return this.httpClient.get(this.serverUrl + 'employees');
}

public getEmployee(id){
    return this.httpClient.get(`${this.serverUrl + 'employees'}/${id}`); 
}
public createEmployee(employee: { name: string, location: string,email:string, mobile: number}){
   console.log(employee.name);
   console.log(employee.location);
   return this.httpClient.post(`${this.serverUrl + 'employees'}`, employee)
}

public deleteEmployee(id){
   console.log("delete:"+ id);
   return this.httpClient.delete(`${this.serverUrl + 'employees'}/${id}`)
}
public updateEmployee(id:number,employee:{id:number,name: string, location: string,email:string, mobile: number}){
  
   console.log("employee "+ employee.name);
   console.log(id);
   return this.httpClient.put(`${this.serverUrl + 'employees'}/${id}`, employee); 
}
}
