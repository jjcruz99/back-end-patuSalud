package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Estado_pedido;
import com.patuSalud.patuSalud.repository.Iestado_pedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Estado_pedidoService implements Iestado_pedidoService{
    @Autowired
    private Iestado_pedidoRepository estadoPedidoRepository;


    @Override
    public void guardarEstadoPedido(Estado_pedido estado) {
        estadoPedidoRepository.save(estado);
    }

    @Override
    public void actualizarEstadoPedido(Long id, Estado_pedido pedidoActualizado) {
        Estado_pedido pedidoExistente = estadoPedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el estado con el ID: " + id));

        if(pedidoExistente != null){
            pedidoExistente.setDescripcion(pedidoActualizado.getDescripcion());

            //GUardar
            estadoPedidoRepository.save(pedidoExistente);
        }
    }

    @Override
    public void eliminarEstadoPedido(Long id) {
        if (estadoPedidoRepository.existsById(id)) {
            estadoPedidoRepository.deleteById(id);
        } else {
            throw new RuntimeException("No se encontró el estado del pedido con el id: " + id);
        }
    }

    @Override
    public Estado_pedido buscarEstadoPedido(Long id) {
        if (estadoPedidoRepository.existsById(id)) {
            Estado_pedido pedido = estadoPedidoRepository.findById(id).orElse(null);
            return pedido;
        } else {
            throw new RuntimeException("No se encontró el estado del pedido con el id: " + id);
        }

    }
}
