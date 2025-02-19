package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Producto;

import java.util.List;

public interface IproductoService {

    //metodo retorna lista de producto
    public List<Producto> obtenerTodosProductos();

    //metodo agregar
    public void agregarProducto (Producto nuevoProducto);

    //metodo eliminar producto
    public void eliminarProducto(Producto eliminarProducto);

    //metodo buscar producto
    public Producto buscarProductoId (Long id);

    //metodo actualizar producto
    public void actualizarProducto (Producto datosProducto);

    //metodo obtener stock producto
    public int obtenerStockProducto(Long id);

    //metodo obtener precio producto
    public double obtenerPrecioProducto (Long id);

}
