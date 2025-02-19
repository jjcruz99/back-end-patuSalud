package com.patuSalud.patuSalud.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Psicologo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id_psicologo;
    private String nombre;
    private String apellido;
    private String identificacion;
    private String celular;
    private String correo;
    private String ciudad;
    private String observacion;

    public Psicologo() {
    }

    public Psicologo(String apellido, String celular, String ciudad, String correo, Long id_psicologo, String identificacion, String nombre, String observacion) {
        this.apellido = apellido;
        this.celular = celular;
        this.ciudad = ciudad;
        this.correo = correo;
        this.id_psicologo = id_psicologo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.observacion = observacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getId_psicologo() {
        return id_psicologo;
    }

    public void setId_psicologo(Long id_psicologo) {
        this.id_psicologo = id_psicologo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
