import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/modelos/persona.model';
import { PersonaService } from 'src/app/servicios/persona.service';

@Component({
    selector: 'app-acercademi',
    templateUrl: './acercademi.component.html',
    styleUrls: ['./acercademi.component.css']
})
export class AcercademiComponent implements OnInit {
    private fecha = new Date('01-01-1900');
    persona: persona = new persona("","",this.fecha,"","","","","");

    constructor(public personaService: PersonaService) { }

    ngOnInit(): void {
        this.personaService.getPersona().subscribe(data => {this.persona = data});
    }

}
