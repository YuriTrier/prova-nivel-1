package com.yuritrier.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yuritrier.entites.Item;
import com.yuritrier.entites.ItemPedido;
import com.yuritrier.entites.Pedido;
import com.yuritrier.repositories.ItemPedidoRepository;
import com.yuritrier.repositories.ItemRepository;
import com.yuritrier.repositories.PedidoRepository;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;	
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Item i1 = new Item(null, "Televisor", 1250.00, 1);
		Item i2 = new Item(null, "Servicos de limpeza", 250.00, 2);
		Item i3 = new Item(null, "Escrivaninha", 380.00, 1);
		
		itemRepository.saveAll(Arrays.asList(i1, i2, i3));
		
		Pedido p1 = new Pedido(null);
		Pedido p2 = new Pedido(null);
		Pedido p3= new Pedido(null);
		
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		ItemPedido ip1 = new ItemPedido(p2, i1, 4, i1.getPreco());
		ItemPedido ip2 = new ItemPedido(p1, i2, 2, i2.getPreco());
		ItemPedido ip3 = new ItemPedido(p3, i3, 1, i3.getPreco());
		ItemPedido ip4 = new ItemPedido(p1, i1, 7, i1.getPreco());
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3, ip4));
	}

	
	
	
}
