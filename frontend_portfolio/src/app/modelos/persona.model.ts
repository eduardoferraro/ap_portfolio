export class persona {
    id?: number;
    nombre: string;
    apellido: string;
    fechaNacimiento: Date;
    telefono: string;
    email: string;
    imagenPersona: string;
    textoPersona: string;
    textoHabilidad: string;

    constructor(nombre:string, apellido:string, fechaNacimiento: Date, telefono: string, email: string, imagenPersona: string, textoPersona: string, textoHabilidad: string) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.imagenPersona = imagenPersona;
        this.textoPersona = textoPersona;
        this.textoHabilidad = textoHabilidad;
    

    }
    
    


    




}