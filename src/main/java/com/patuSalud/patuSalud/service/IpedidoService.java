package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Pedido;

import java.util.List;

public interface IpedidoService {

    public List<Pedido> obtenerTodosPedidos();

    public void agregarPedido( Pedido pedidoNuevo);

    public void actualizarPedido(Long id, Pedido pedidoActualizado);

    public void eliminarPedido(Long id);

    public Pedido buscarPedidoId (Long id);


}
