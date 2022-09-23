import { Component, OnInit } from '@angular/core';

declare var window: any;

@Component({
    selector: 'app-menu',
    templateUrl: './menu.component.html',
    styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
    
    //modal
    loginModal: any;

    constructor() { }

    ngOnInit(): void {
        //modal
        this.loginModal = new window.bootstrap.Modal(
            document.getElementById('login-modal')
        );
    }

    //modal
    abrirLoginModal() {
        this.loginModal.show();
    }

    
    
    
}
