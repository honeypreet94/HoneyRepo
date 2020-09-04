import {Directive,ElementRef,Renderer2 } from '@angular/core';

@Directive({
    selector:'[myHidden]'
})

export class HiddenDirective{
    constructor(el: ElementRef ,renderer:Renderer2){
        renderer.setStyle(el.nativeElement,'display','none');
    }
}   