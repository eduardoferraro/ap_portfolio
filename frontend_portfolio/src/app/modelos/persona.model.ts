export class persona {
    id: number;
    nombre: String;
    apellido: String;
    fechaNacimiento: Date;
    telefono: String;
    email: String;
    imagenPersona: String;
    textoPersona: String;
    textoHabilidad: String;

    constructor(nombre:String, apellido:String, fechaNacimiento: Date, telefono: String, email: String, imagenPersona: String, textoPersona: String, textoHabilidad: String) {
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