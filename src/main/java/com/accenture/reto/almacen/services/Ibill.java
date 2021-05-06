package com.accenture.reto.almacen.services;


import java.util.List;
import java.util.Date;

import com.accenture.reto.almacen.entitys.Bill;

public interface Ibill {
	Bill saveOrder(Bill bill);
	static Bill updateOrder(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}
	Bill getOrder(Integer id);
	Date getOrderDate(Integer orderId);
	
	void saveAllOrders(List<Bill>orders);
	void deleteOrder(Integer id);


}
