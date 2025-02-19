package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Detalles_pedido;
import com.patuSalud.patuSalud.repository.Idetalles_pedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Detalles_pedidoService implements Idetalles_pedidoService{

    private Idetalles_pedidoRepository Detalles_pedidoRepository;

    @Override
    public void guardarDetallesPedido(Detalles_pedido pedido) {
        Detalles_pedidoRepository.save(pedido);
    }

    @Override
    public List<Detalles_pedido> mostrarDetallesPedido() {
        List<Detalles_pedido> listaDetalles = Detalles_pedidoRepository.findAll();
        return listaDetalles;
    }

    @Override
    public void actualizaDetallesPedido(Long id, Detalles_pedido pedidoActualizado) {
        Detalles_pedido detallesPedidoExistente = Detalles_pedidoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("El pedido con ID " + id + " no existe"));
        if(detallesPedidoExistente != null){
            //Update de los datos
            //Entro a modificar con setters y get para recibirlos

            detallesPedidoExistente.setCantidad(pedidoActualizado.getCantidad());
            detallesPedidoExistente.setId_producto_FK(pedidoActualizado.getId_producto_FK());
            detallesPedidoExistente.setId_agenda_cita_FK(pedidoActualizado.getId_agenda_cita_FK());

            //GUardar
            Detalles_pedidoRepository.save(detallesPedidoExistente);
        }
    }

    @Override
    public void eliminarDetallesPedido(Long id) {
        if (Detalles_pedidoRepository.existsById(id)) {
            Detalles_pedidoRepository.deleteById(id);
        } else {
            throw new RuntimeException("No se encontró el detalle de pedido con el id: " + id);
        }
    }

    @Override
    public Double calcularTotalPedido(Long idPedido) {
        List<Detalles_pedido> detalles = Detalles_pedidoRepository.findAll();

        double total = 0;
        for (Detalles_pedido detalle : detalles) {
            if (detalle.getId_pedido_FK().equals(idPedido)) {
                total += detalle.getCantidad() * detalle.getPrecio_cantidad();
            }
        }

        return total;
    }

    @Override
    public Detalles_pedido buscarPedido(Long id) {
        return Detalles_pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el detalle de pedido con el ID: " + id));
    }


}
