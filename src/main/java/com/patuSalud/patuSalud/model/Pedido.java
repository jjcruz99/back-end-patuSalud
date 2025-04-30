package com.patuSalud.patuSalud.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id_pedido;
    private double cantidad;
    private double precio_total;
    private LocalDate fecha_pedido;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Producto producto;

    public Pedido() {
    }

    public Pedido(Long id_pedido, double cantidad, double precio_total, LocalDate fecha_pedido, Usuario usuario, Producto producto) {
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
        this.fecha_pedido = fecha_pedido;
        this.usuario = usuario;
        this.producto = producto;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDate fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}

