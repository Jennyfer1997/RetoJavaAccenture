package com.accenture.reto.almacen.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.reto.almacen.date.CustomerRepository;
import com.accenture.reto.almacen.entitys.Customer;
import com.accenture.reto.almacen.services.Icustomer;

public class CustomerRest implements Icustomer {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Boolean getUser(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
	    customerRepository.save(customer);
	}

}
