package com.patuSalud.patuSalud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id_pedido;
    private Long id_usuario_fk;
    private Long id_estado_pedido_fk;
    private double precio_total;
    private Date fecha_pedido;

    public Pedido() {
    }

    public Pedido(Long id_pedido, Long id_usuario_fk, Long id_estado_pedido_fk, double precio_total, Date fecha_pedido) {
        this.id_pedido = id_pedido;
        this.id_usuario_fk = id_usuario_fk;
        this.id_estado_pedido_fk = id_estado_pedido_fk;
        this.precio_total = precio_total;
        this.fecha_pedido = fecha_pedido;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Long getId_usuario_fk() {
        return id_usuario_fk;
    }

    public void setId_usuario_fk(Long id_usuario_fk) {
        this.id_usuario_fk = id_usuario_fk;
    }

    public Long getId_estado_pedido_fk() {
        return id_estado_pedido_fk;
    }

    public void setId_estado_pedido_fk(Long id_estado_pedido_fk) {
        this.id_estado_pedido_fk = id_estado_pedido_fk;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
}
