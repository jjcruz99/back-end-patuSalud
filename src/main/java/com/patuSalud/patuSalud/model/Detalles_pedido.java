package com.patuSalud.patuSalud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Detalles_pedido {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)

    private Long id_detalles_pedido;
    private Long id_pedido_FK;
    private Long id_producto_FK;
    private Long id_agenda_cita_FK;
    private int cantidad;
    private Double precio_cantidad;

    public Detalles_pedido() {

    }

    public Detalles_pedido(int cantidad, Long id_agenda_cita_FK, Long id_detalles_pedido, Long id_pedido_FK, Long id_producto_FK, Double precio_cantidad) {
        this.cantidad = cantidad;
        this.id_agenda_cita_FK = id_agenda_cita_FK;
        this.id_detalles_pedido = id_detalles_pedido;
        this.id_pedido_FK = id_pedido_FK;
        this.id_producto_FK = id_producto_FK;
        this.precio_cantidad = precio_cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Long getId_agenda_cita_FK() {
        return id_agenda_cita_FK;
    }

    public void setId_agenda_cita_FK(Long id_agenda_cita_FK) {
        this.id_agenda_cita_FK = id_agenda_cita_FK;
    }

    public Long getId_detalles_pedido() {
        return id_detalles_pedido;
    }

    public void setId_detalles_pedido(Long id_detalles_pedido) {
        this.id_detalles_pedido = id_detalles_pedido;
    }

    public Long getId_pedido_FK() {
        return id_pedido_FK;
    }

    public void setId_pedido_FK(Long id_pedido_FK) {
        this.id_pedido_FK = id_pedido_FK;
    }

    public Long getId_producto_FK() {
        return id_producto_FK;
    }

    public void setId_producto_FK(Long id_producto_FK) {
        this.id_producto_FK = id_producto_FK;
    }

    public Double getPrecio_cantidad() {
        return precio_cantidad;
    }

    public void setPrecio_cantidad(Double precio_cantidad) {
        this.precio_cantidad = precio_cantidad;
    }
}
