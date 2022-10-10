package com.ap_portfolio.efe9.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Error de validacion en nombre")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Error de validacion en apellido")
    private String apellido;
    
    @NotNull
    private Date fechaNacimiento;
    
    @NotNull
    @Size(min = 10, max = 15, message = "Error de validacion en telefono")
    private String telefono;
    
    @NotNull
    @Size(min = 8, max = 50, message = "Error de validacion en email")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Error de validacion en imagen")
    private String imagenPersona;
    
    @NotNull
    @Size(min = 1, max = 400, message = "Error de validacion en texto de persona")
    private String textoPersona;
    
    @NotNull
    @Size(min = 1, max = 400, message = "Error de validacion en texto de habilidad")
    private String textoHabilidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagenPersona() {
        return imagenPersona;
    }

    public void setImagenPersona(String imagenPersona) {
        this.imagenPersona = imagenPersona;
    }

    public String getTextoPersona() {
        return textoPersona;
    }

    public void setTextoPersona(String textoPesona) {
        this.textoPersona = textoPesona;
    }

    public String getTextoHabilidad() {
        return textoHabilidad;
    }

    public void setTextoHabilidad(String textoHabilidad) {
        this.textoHabilidad = textoHabilidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    
         
}
