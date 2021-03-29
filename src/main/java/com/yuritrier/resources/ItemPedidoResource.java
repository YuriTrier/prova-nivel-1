package com.yuritrier.resources;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuritrier.entites.Item;
import com.yuritrier.entites.ItemPedido;
import com.yuritrier.entites.Pedido;
import com.yuritrier.services.ItemPedidoService;
import com.yuritrier.services.ItemService;
import com.yuritrier.services.PedidoService;

@RestController
@RequestMapping(value = "/itempedido")
public class ItemPedidoResource {

	private ItemPedido itemPedido;
	
	@Autowired
	private ItemPedidoService service;
	
	private Item itemService;
	
	private Pedido pedidoService;
	
	@Autowired
	private PedidoService serviceP;
	
	@Autowired
	private ItemService serviceI;
	
	@PostMapping
	public ResponseEntity<ItemPedido> insert(@RequestBody ItemPedido obj) {
		itemService = serviceI.findById(obj.getItem().getId());
		pedidoService = serviceP.findById(obj.getPedido().getId());
		itemPedido = new ItemPedido(pedidoService, itemService, obj.getQuantidade(), obj.getPreco());
		service.insert(itemPedido);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
