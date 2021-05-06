package com.accenture.reto.almacen.date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.reto.almacen.entitys.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
