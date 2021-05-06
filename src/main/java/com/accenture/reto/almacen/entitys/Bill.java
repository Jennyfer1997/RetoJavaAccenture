package com.accenture.reto.almacen.entitys;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Bill {

	@Id
	private Integer id;
	private double total;
	private double iva;
	private double shippingPrice;
	private double finalPrice;
	private Integer state;
	private Date date;
	private Date created=new Date();
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
		
	}
	public List<Product> getProduct() {
		
		return null;
	}
	
	
	
	
	
	
	
}
