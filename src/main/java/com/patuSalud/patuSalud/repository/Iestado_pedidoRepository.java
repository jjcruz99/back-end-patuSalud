package com.patuSalud.patuSalud.repository;

import com.patuSalud.patuSalud.model.Estado_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iestado_pedidoRepository extends JpaRepository<Estado_pedido,Long> {
}
