package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Pedido;
import com.patuSalud.patuSalud.model.Usuario;
import com.patuSalud.patuSalud.repository.IpedidoRepository; // Ensure you have this import
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PedidoService implements IpedidoService {

    @Autowired
    private IpedidoRepository pedidoRepository; // Inject the repository

    @Override
    public List<Pedido> obtenerTodosPedidos() {
        return pedidoRepository.findAll(); // Retrieve all Pedidos from the database
    }

    @Override
    public Pedido savepedido(Pedido pedidoNuevo) {
        return pedidoRepository.save(pedidoNuevo); // Save the new Pedido to the database
    }


    @Override
    public void actualizarPedido(Long id, Pedido pedidoActualizado) {
        Pedido existingPedido = pedidoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pedido not found with ID: " + id));

        // Update fields from the existing Pedido
        existingPedido.setCantidad(pedidoActualizado.getCantidad());
        existingPedido.setPrecio_total(pedidoActualizado.getPrecio_total());
        existingPedido.setFecha_pedido(pedidoActualizado.getFecha_pedido());
        existingPedido.setUsuario(pedidoActualizado.getUsuario());
        existingPedido.setProducto(pedidoActualizado.getProducto());

        pedidoRepository.save(existingPedido); // Save the updated Pedido
    }

    @Override
    public void deletepedido(Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Pedido not found with ID: " + id);
        }
    }

    @Override
    public Pedido buscarpedidoId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pedido not found with ID: " + id));
    }

    @Override
    public List<Pedido> filtrarPedioIdUsuario(Long idUsuario) {
        List<Pedido> totalPedidos =  pedidoRepository.findAll();
        List<Pedido> pedidosUsuario = new ArrayList<>();
            ///buscar pedidos asociados a un usuario
            for(Pedido pedidoActual : totalPedidos){
                Usuario usuarioPedido = pedidoActual.getUsuario();
                if (Objects.equals(usuarioPedido.getId_usuario(), idUsuario)){
                    pedidosUsuario.add(pedidoActual);
                }
            }
        return pedidosUsuario;
    }


}