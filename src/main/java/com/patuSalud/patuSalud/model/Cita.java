package com.patuSalud.patuSalud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cita {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id_cita;
    private String descripcion;
    private Double precio;

    public Cita() {

    }

    public Cita(Long id_cita, String descripcion, Double precio) {
        this.id_cita = id_cita;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Long getId_cita() {
        return id_cita;
    }

    public void setId_cita(Long id_cita) {
        this.id_cita = id_cita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
