package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Pedido;
import com.patuSalud.patuSalud.repository.IpedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements IpedidoService {

    private IpedidoRepository pedidoRepository;

    @Override
    public List<Pedido> obtenerTodosPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public void agregarPedido(Pedido pedidoNuevo) {
       pedidoRepository.save(pedidoNuevo);
    }

    @Override
    public void actualizarPedido(Long id, Pedido pedidoActualizado) {

        Pedido existePedido = pedidoRepository.findById(id).orElse(null);
        if (existePedido != null ){
            existePedido.setFecha_pedido(pedidoActualizado.getFecha_pedido());
            existePedido.setPrecio_total(pedidoActualizado.getPrecio_total());
            existePedido.setId_estado_pedido_fk(pedidoActualizado.getId_estado_pedido_fk());
            existePedido.setId_usuario_fk(pedidoActualizado.getId_usuario_fk());

            pedidoRepository.save(existePedido);
        }
        else {
            System.out.println("No existe el pedido");
        }
    }

    @Override
    public void eliminarPedido(Long id) {
        if(pedidoRepository.existsById(id)){
            pedidoRepository.deleteById(id);
        }else{
            System.out.println("No se encuentran pedidos con ese Id");
        }
    }

    @Override
    public Pedido buscarPedidoId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}
