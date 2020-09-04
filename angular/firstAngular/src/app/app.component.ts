import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `<h1> {{title}} </h1>
			<h2> {{'title:' + title}} </h2>
			<h3> {{2+5}} </h3>
			<h4>{{'title:' + getTitle()}} </h4>
			<h5 title={{title}} > Move cursor here to see the title </h5>
			`
})
export class AppComponent {
  title = 'firstAngular';
  
  getTitle(){
	  return this.title;
  }
  
}
