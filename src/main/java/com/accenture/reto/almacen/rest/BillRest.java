package com.accenture.reto.almacen.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.reto.almacen.date.BillRepository;
import com.accenture.reto.almacen.entitys.Bill;
import com.accenture.reto.almacen.services.Ibill;

@Service
public class BillRest implements Ibill{

	
	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill saveOrder(Bill bill) {
		return billRepository.save(bill);
	}

	@Override
	public Bill updateOrder(Bill bill) {
		return billRepository.save(bill);
	}

	@Override
	public Date getOrderDate(Integer id){
		 Optional<Bill> optionalC = billRepository.findById(id);
	        Bill order = optionalC.get();
	        return order.getCreated();
	}

	@Override
	public void deleteOrder(Integer id) {
	 billRepository.deleteById(id);
		
	}

	@Override
	public void saveAllOrders(List<Bill> orders) {
	   billRepository.saveAll(orders);
		
	}


	public Bill getOrder(Integer id) {
		Optional<Bill> optional = billRepository.findById(id);
        Bill order = optional.get();
        return order;
	}


	
	
}
