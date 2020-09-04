import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Nesting Components using atOutput (Event demonstration)';
  selectedEmployee: string = "None";

  onItemClicked(message: string): void {
    this.selectedEmployee = message;
  }
}
