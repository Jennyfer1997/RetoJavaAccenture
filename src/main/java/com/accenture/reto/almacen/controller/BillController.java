
package com.accenture.reto.almacen.controller;



import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.reto.almacen.entitys.Bill;
import com.accenture.reto.almacen.services.Ibill;
import com.accenture.reto.almacen.services.Icustomer;
import com.accenture.reto.almacen.services.Iproduct;

@RestController
@RequestMapping("order")
public abstract class BillController implements Icustomer,Ibill,Iproduct{


	@Autowired
	private Icustomer  icustomer;
	
	@Autowired
	private Ibill ibill;
	
	@Autowired
	private Iproduct iproduct;
	
	@PostMapping("/save")
	public List<Object> saveOrder(@RequestBody Bill bill) throws Exception {
		List<Product> products = bill.getProduct();

		double total;
		double iva;
		double shippingPrice=7000;
		double finalPrice;
		
		List<Object> response = new LinkedList<>();
		
			Boolean customerExist = getCustomer(bill);

			if (customerExist) {
				total = calculatetotal(products);
				iva = total * 0.19;
				
				if (total >70000 && total<100000) {
				 shippingPrice=7000;
				 finalPrice= total+iva+shippingPrice;
				}
				else if (total>100000) {
					shippingPrice=0;
					finalPrice=total+iva+shippingPrice;
				}
				
				bill.setShippingPrice(shippingPrice);
				bill.setState(1);
				bill.setTotal(total);
				bill.setIva(iva);
				bill.setFinalPrice(finalPrice);

				Bill order = Ibill.updateOrder(bill);
				order.setProducts(products);
				response.add(order);
				response.add("SU PEDIDO HA SIDO ACTUALIZADO");
				return response;

				
				
				
			}
			else response.add("NO EXISTE");
		} 
	

	private Boolean getUser(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	private double calculateTotal(List<Product> products) {
		// TODO Auto-generated method stub
		return 0;
	}
}

