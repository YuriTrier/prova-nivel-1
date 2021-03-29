package com.yuritrier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuritrier.entites.ItemPedido;
import com.yuritrier.repositories.ItemPedidoRepository;

@Service
public class ItemPedidoService {

	@Autowired
	private ItemPedidoRepository repository;
	
	public ItemPedido insert(ItemPedido obj) {
		return repository.save(obj);
	}

}
