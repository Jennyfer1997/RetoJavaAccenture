package com.accenture.reto.almacen.date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.reto.almacen.entitys.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
