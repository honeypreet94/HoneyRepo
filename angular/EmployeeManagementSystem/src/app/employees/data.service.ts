import { Injectable } from '@angular/core';
import {InMemoryDbService} from 'angular-in-memory-web-api';

@Injectable({
  providedIn: 'root'
})
export class DataService implements InMemoryDbService{

  constructor() { }

  createDb(){
    let employees=[
      {
          id: 2,
          name: "RAM",
          location: "Bangalore",
          email: "ram@mail.com",
          mobile: 9867512345

      },
      {
          id: 1,
          name: "RAJ",
          location: "Chennai",
          email: "raj@mail.com",
          mobile: 7867534521

      },
      {
          id: 3,
          name: "VINAY",
          location: "Pune",
          email: "vinaym@mail.com",
          mobile: 9975287450

      }
    ];

    return {employees};
  }
}
