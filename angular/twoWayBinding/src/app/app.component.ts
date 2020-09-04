import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string= 'twoWayBinding';
  name: string='james';
  loc: string='Pune';

  setUpperCaseLocation(locationData: string)
  {
    this.loc=locationData.toUpperCase();
  }
}
