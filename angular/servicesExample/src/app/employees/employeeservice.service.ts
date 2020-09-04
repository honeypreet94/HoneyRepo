import { Injectable } from '@angular/core';

@Injectable()
export class EmployeeserviceService {

  getEmployees(): any[]{
    return[
      {
        id:1,
        name: "Honey"
      },
      {
        id: 2,
        name: "yo"
      }

    ]
  }
}
