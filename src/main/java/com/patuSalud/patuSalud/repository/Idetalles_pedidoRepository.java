package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Detalles_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Idetalles_pedidoRepository extends JpaRepository<Detalles_pedido,Long> {
}
