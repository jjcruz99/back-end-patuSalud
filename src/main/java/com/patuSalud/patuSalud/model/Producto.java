package com.patuSalud.patuSalud.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_producto;
    private String nombreProducto;
    private int referencia;
    private Double precio_unitario;
    private String observacion;
    private String imagen_url;
    private String descripcion;
    private int cantidad_disponible;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Pedido> producto;

    public Producto() {

    }

    public Producto(int cantidad_disponible, String descripcion, Long id_producto, String imagen_url, String nombreProducto, String observacion, Double precio_unitario, int referencia) {
        this.cantidad_disponible = cantidad_disponible;
        this.descripcion = descripcion;
        this.id_producto = id_producto;
        this.imagen_url = imagen_url;
        this.nombreProducto = nombreProducto;
        this.observacion = observacion;
        this.precio_unitario = precio_unitario;
        this.referencia = referencia;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
}
