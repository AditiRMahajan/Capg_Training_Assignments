package com.springrest.Model;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id
	private Integer customerId;
    private String customerName;
    
	public Customer() {
		super();
	}

	public Customer(Integer customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    
    

}
