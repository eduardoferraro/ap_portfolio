import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { MenuComponent } from './componentes/menu/menu.component';
import { AcercademiComponent } from './componentes/acercademi/acercademi.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { HabilidadesComponent } from './componentes/habilidades/habilidades.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { PiedepaginaComponent } from './componentes/piedepagina/piedepagina.component';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './componentes/login/login.component';
import { InicioComponent } from './componentes/inicio/inicio.component';
import { FormsModule } from '@angular/forms';
import { interceptorProvider } from './servicios/interceptor-service';

@NgModule({
    declarations: [
        AppComponent,
        EncabezadoComponent,
        MenuComponent,
        AcercademiComponent,
        ExperienciaComponent,
        EducacionComponent,
        HabilidadesComponent,
        ProyectosComponent,
        PiedepaginaComponent,
        LoginComponent,
        InicioComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        AppRoutingModule,
        FormsModule
    ],
    providers: [
        interceptorProvider
    ],
    bootstrap: [AppComponent]
})

export class AppModule { }
