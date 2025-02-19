package com.patuSalud.patuSalud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity

public class Agenda_citas {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)

    private Long id_agenda_cita;
    private Long id_usuario_FK;
    private Long id_psicologo_FK;
    private Long id_cita_FK;
    private Date fecha_cita;
    private Long id_estado_cita_FK;
    private String observacion;

    public Agenda_citas() {
    }

    public Agenda_citas(Date fecha_cita, Long id_agenda_cita, Long id_cita_FK, Long id_estado_cita_FK, Long id_psicologo_FK, Long id_usuario_FK, String observacion) {
        this.fecha_cita = fecha_cita;
        this.id_agenda_cita = id_agenda_cita;
        this.id_cita_FK = id_cita_FK;
        this.id_estado_cita_FK = id_estado_cita_FK;
        this.id_psicologo_FK = id_psicologo_FK;
        this.id_usuario_FK = id_usuario_FK;
        this.observacion = observacion;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public Long getId_agenda_cita() {
        return id_agenda_cita;
    }

    public void setId_agenda_cita(Long id_agenda_cita) {
        this.id_agenda_cita = id_agenda_cita;
    }

    public Long getId_cita_FK() {
        return id_cita_FK;
    }

    public void setId_cita_FK(Long id_cita_FK) {
        this.id_cita_FK = id_cita_FK;
    }

    public Long getId_estado_cita_FK() {
        return id_estado_cita_FK;
    }

    public void setId_estado_cita_FK(Long id_estado_cita_FK) {
        this.id_estado_cita_FK = id_estado_cita_FK;
    }

    public Long getId_psicologo_FK() {
        return id_psicologo_FK;
    }

    public void setId_psicologo_FK(Long id_psicologo_FK) {
        this.id_psicologo_FK = id_psicologo_FK;
    }

    public Long getId_usuario_FK() {
        return id_usuario_FK;
    }

    public void setId_usuario_FK(Long id_usuario_FK) {
        this.id_usuario_FK = id_usuario_FK;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
