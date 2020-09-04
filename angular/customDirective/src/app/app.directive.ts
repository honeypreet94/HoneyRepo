import {Directive, HostListener, Renderer2, ElementRef } from '@angular/core';

@Directive({
    selector :'[myUnderline]'
})

export class UnderLineDirective{

    constructor(
        private renderer : Renderer2,
        private el: ElementRef
    ){}

    @HostListener('mouseenter') onMouseEnter(){
        this.hover(true);
    }
    @HostListener('mouseleave') onMouseLeave(){
        this.hover(false);
    }

    hover(shouldUnderLine :boolean){
        if(shouldUnderLine){
            this.renderer.setStyle(this.el.nativeElement, 'text-decoration', 'undrline');
        }
        else{
            this.renderer.setStyle(this.el.nativeElement, 'text-decoration', 'none');
        }
    }
}