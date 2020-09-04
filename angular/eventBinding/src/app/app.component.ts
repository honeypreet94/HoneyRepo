import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  
})
export class AppComponent {
  title = 'eventBinding';
  counter: number=0;
  inputData: string='Hello';

  incrementCounter()
  {
    this.counter=this.counter+1;
  }

  setInputData(value:string)
  {
    this.inputData=value;

  }

}
