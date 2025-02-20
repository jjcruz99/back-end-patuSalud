package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Detalles_pedido;

import java.util.List;

public interface Idetalles_pedidoService {

    //Metodos
    // Crear un nuevo detalle de pedido
    public void guardarDetallesPedido(Detalles_pedido pedido);

    // Mostrar informacion del pedido segun el id
    public List<Detalles_pedido> mostrarDetallesPedido();

    //Actualizar un detalle de pedido
    void actualizaDetallesPedido(Long id, Detalles_pedido pedidoActualizado);

    // Eliminar un detalle de pedido por ID
    public void eliminarDetallesPedido(Long id);

    // Calcular el total del pedido sumar el precio de todos los detalles del pedido
    public Double calcularTotalPedido(Long idPedido);

    // Buscar la existencia de productos antes de confirmar un pedido
    public Detalles_pedido buscarPedido (Long id);

}
