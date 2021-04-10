package org.question1;

public class Customer {
	private int customerID;
	private String customerName,customerContact;
	private Address customerAddress;
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerContact() {
		return customerContact;
	}
	
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void getCustomerDetails() {
		System.out.println("Customer id: "+customerID+", Customer Name: "+customerName+" Contact No.: "+customerContact);
		System.out.println("Address: "+customerAddress);
		
	}
}
