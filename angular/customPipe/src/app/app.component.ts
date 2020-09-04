import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Employees List';
  nameFilter: string ='';
  employees: any[] = [
    {
      "empid": 1,
      "name": "Honey",
      "location" : "Hyderbad"
    },
    {
      empid: 2,
      name: "YO",

    }
  ];
}
