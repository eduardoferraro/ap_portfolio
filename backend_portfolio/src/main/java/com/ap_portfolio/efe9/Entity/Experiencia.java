package com.ap_portfolio.efe9.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExperiencia;
    private String nombreEmpresa;
    private String descripcionExperiencia;
    private String anioDesde;
    private String mesDesde;
    private String anioHasta;  
    private String mesHasta; 
    private boolean esActual;
    
    public Experiencia() {
    }

    public Experiencia(String nombreEmpresa, String descripcionExperiencia, String anioDesde, String mesDesde, String anioHasta, String mesHasta, boolean esActual) {
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionExperiencia = descripcionExperiencia;
        this.anioDesde = anioDesde;
        this.mesDesde = mesDesde;
        this.anioHasta = anioHasta;
        this.mesHasta = mesHasta;
        this.esActual = esActual;
    }

       
    
    //Getters and setters

    public int getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(int idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }

    public String getAnioDesde() {
        return anioDesde;
    }

    public void setAnioDesde(String anioDesde) {
        this.anioDesde = anioDesde;
    }

    public String getMesDesde() {
        return mesDesde;
    }

    public void setMesDesde(String mesDesde) {
        this.mesDesde = mesDesde;
    }

    public String getAnioHasta() {
        return anioHasta;
    }

    public void setAnioHasta(String anioHasta) {
        this.anioHasta = anioHasta;
    }

    public String getMesHasta() {
        return mesHasta;
    }

    public void setMesHasta(String mesHasta) {
        this.mesHasta = mesHasta;
    }

    public boolean isEsActual() {
        return esActual;
    }

    public void setEsActual(boolean esActual) {
        this.esActual = esActual;
    }

    

    
    
}