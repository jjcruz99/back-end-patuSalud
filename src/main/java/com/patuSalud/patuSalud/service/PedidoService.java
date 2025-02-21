package com.patuSalud.patuSalud.service;
import com.patuSalud.patuSalud.model.Pedido;
import com.patuSalud.patuSalud.model.Producto;
import com.patuSalud.patuSalud.repository.IpedidoRepository; // Ensure you have this import
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public void agregarProducto(Producto nuevoProducto) {
        // Assuming you have a repository for Producto, you should save it here
        // productoRepository.save(nuevoProducto);
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
            pedidoRepository.deleteById(id); // Delete the Pedido by ID
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
    public void updatePedido(Long id, Pedido pedidoActualizado) {
        actualizarPedido(id, pedidoActualizado); // Reuse the actualizarPedido method
    }

    @Override
    public void deletePedido(Long id) {
        deletepedido(id); // Reuse the deletepedido method
    }

    @Override
    public Pedido buscarPedidoId(Long id) {
        return buscarpedidoId(id); // Reuse the buscarpedidoId method
    }

    @Override
    public List<Pedido> getpedido() {
        return List.of();
    }

    @Override
    public void updatepedido(Long id, Pedido pedidoActualizado) {
        actualizarPedido(id, pedidoActualizado);

    }
}