package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Pedido;
import com.patuSalud.patuSalud.model.Producto;
import java.util.List;

public interface IpedidoService {


    List<Pedido> obtenerTodosPedidos(); // Retrieve all Pedidos

    Pedido savepedido(Pedido pedidoNuevo); // Save a new Pedido

    void agregarProducto(Producto nuevoProducto); // Add a new Producto (implementation may vary)

    void actualizarPedido(Long id, Pedido pedidoActualizado); // Update an existing Pedido

    void deletepedido(Long id); // Delete a Pedido by ID

    Pedido buscarpedidoId(Long id); // Find a Pedido by ID

    void updatePedido(Long id, Pedido pedidoActualizado); // Update a Pedido (alternative method)

    void deletePedido(Long id); // Delete a Pedido (alternative method)

    Pedido buscarPedidoId(Long id); // Find a Pedido by ID (alternative method)

    List<Pedido> getpedido();

    void updatepedido(Long id, Pedido pedidoActualizado);
}
