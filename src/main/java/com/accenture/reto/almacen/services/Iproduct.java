package com.accenture.reto.almacen.services;

import java.util.List;
import com.accenture.reto.almacen.entitys.Product;

public interface Iproduct {
	Product getProduct(int Id);
	void saveAllProduct(List<Product> products);
}
