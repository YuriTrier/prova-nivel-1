package com.yuritrier.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yuritrier.entites.Item;
import com.yuritrier.repositories.ItemRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;	
	
	@Override
	public void run(String... args) throws Exception {

		Item i1 = new Item(null, "Televisor", 1250.00, 1);
		Item i2 = new Item(null, "Servicos de limpeza", 250.00, 2);
		Item i3 = new Item(null, "Escrivaninha", 380.00, 1);
		
		itemRepository.saveAll(Arrays.asList(i1, i2, i3));
	}

	
	
	
}
