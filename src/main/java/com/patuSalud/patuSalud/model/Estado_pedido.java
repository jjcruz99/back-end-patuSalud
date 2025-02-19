package com.patuSalud.patuSalud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estado_pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_estado_pedido;
    private String descripcion;

    public Estado_pedido() {
    }

    public Estado_pedido(String descripcion, Long id_estado_pedido) {
        this.descripcion = descripcion;
        this.id_estado_pedido = id_estado_pedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId_estado_pedido() {
        return id_estado_pedido;
    }

    public void setId_estado_pedido(Long id_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
    }
}
