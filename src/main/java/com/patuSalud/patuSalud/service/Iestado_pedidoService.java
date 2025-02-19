package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Estado_pedido;

public interface Iestado_pedidoService {

    //Metodos
    //Guardar o agregar otro estado de pedido
    public void guardarEstadoPedido(Estado_pedido estado);

    //Actualizar estado de pedido
    void actualizarEstadoPedido(Long id, Estado_pedido pedidoActualizado);

    //Eliminar estado de pedido
    public void eliminarEstadoPedido(Long id);

    //Buscar estado de pedido
    public Estado_pedido buscarEstadoPedido (Long id);


}
