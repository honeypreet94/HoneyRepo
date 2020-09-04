import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'lifeCyleMethods';
  company: string = "wipro";
  location: string ="Banglore";
  hasChild: boolean =true;

  toggleChild(){
    this.hasChild= !this.hasChild;
  }
}
