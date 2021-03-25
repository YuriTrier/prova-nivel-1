package com.yuritrier.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuritrier.entites.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, UUID> {

}
