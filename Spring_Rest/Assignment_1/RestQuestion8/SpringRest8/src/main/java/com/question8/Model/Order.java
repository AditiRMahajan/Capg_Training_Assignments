package com.question8.Model;

import java.time.LocalDate;
import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="ProductOrders")
public class Order {
	@Id
	private long orderId;
	private double total;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate orderDate;
	private Customer customer;
	private List<LineItem> lineItems;
	
	public Order() {
		super();
	}

	public Order(long orderId, double total, LocalDate orderDate, Customer customer) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.orderDate = orderDate;
		this.customer = customer;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }
	
    public void removeLineItem(LineItem lineItem) {
    	lineItems.removeIf( o -> o.getItemId() == lineItem.getItemId());
    }
    
    public List<LineItem> getLineItems() {
        return lineItems;
    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", total=" + total + ", orderDate=" + orderDate + ", customer=" + customer
				+ ", items=" + lineItems + "]";
	}
	
	

}
