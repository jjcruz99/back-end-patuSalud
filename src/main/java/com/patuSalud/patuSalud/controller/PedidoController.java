package com.patuSalud.patuSalud.controller;
import com.patuSalud.patuSalud.model.Pedido;
import com.patuSalud.patuSalud.service.IpedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    private IpedidoService pedidoService;

    // Obtener todos los pedidos
    @GetMapping("/traer/pedido")
    public List<Pedido> obtenerTodosPedidos() {
        return pedidoService.obtenerTodosPedidos();
    }

    // Agregar un nuevo pedido
    @PostMapping("/agregar/pedido")
    public String agregarPedido(@RequestBody Pedido pedidoNuevo) {
        pedidoService.savepedido(pedidoNuevo);
        return "Pedido agregado exitosamente";
    }

    // Actualizar un pedido existente
    @PutMapping("/actualizar/pedido/{id}")
    public String actualizarPedido(@PathVariable Long id, @RequestBody Pedido pedidoActualizado) {
        pedidoService.updatepedido(id, pedidoActualizado);
        return "Pedido actualizado exitosamente";
    }

    // Eliminar un pedido por ID
    @DeleteMapping("/eliminar/pedido/{id}")
    public String eliminarPedido(@PathVariable Long id) {
        pedidoService.deletepedido(id);
        return "Pedido eliminado exitosamente";
    }

    // Buscar un pedido por ID
    @GetMapping("/buscar/pedido/{id}") // Corrected endpoint
    public Pedido buscarPedidoPorId(@PathVariable Long id) {
        return pedidoService.buscarpedidoId(id);
    }
}