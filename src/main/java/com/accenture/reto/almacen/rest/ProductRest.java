package com.accenture.reto.almacen.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.reto.almacen.date.ProductRepository;
import com.accenture.reto.almacen.entitys.Product;
import com.accenture.reto.almacen.services.Iproduct;

@Service
public class ProductRest implements Iproduct{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product getProduct(int Id) {
		
		return null;
	}

	@Override
	public void saveAllProduct(List<Product> products) {
		
		productRepository.saveAll(products);
		
	}

}
