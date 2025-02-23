package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Pedido;
import com.patuSalud.patuSalud.model.Producto;
import java.util.List;

public interface IpedidoService {


    List<Pedido> obtenerTodosPedidos(); // Retrieve all Pedidos

    Pedido savepedido(Pedido pedidoNuevo); // Save a new Pedido

    void actualizarPedido(Long id, Pedido pedidoActualizado); // Update an existing Pedido

    void deletepedido(Long id); // Delete a Pedido by ID

    Pedido buscarpedidoId(Long id); // Find a Pedido by ID

   public List<Pedido> filtrarPedioIdUsuario(Long idUsuario);
}
