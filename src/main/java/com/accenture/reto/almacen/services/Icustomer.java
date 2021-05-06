package com.accenture.reto.almacen.services;

import com.accenture.reto.almacen.entitys.Customer;

public interface Icustomer {
	Boolean getUser(int Id);
	void saveCustomer(Customer customer);
}
