import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipesExample';
  todayDate: any=new Date("August 27,2020 8:30:00");
  employees: any[]=[
    {
      empid :1,
      name : "Honey",
      location : "Punjab"
    },
    {
      empid : 2,
      name : "Yo Yo",
      location : "Hyderabad"
    }
  ]
}
