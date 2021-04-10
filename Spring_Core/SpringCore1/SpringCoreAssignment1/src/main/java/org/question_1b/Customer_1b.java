package org.question_1b;

public class Customer_1b {
	private int customerID;
	private String customerName,customerContact;
	private Address_1b customerAddress;
	
	public Customer_1b(int customerID, String customerName, String customerContact, Address_1b customerAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerID() {
		return customerID;
	}
	
	public String getCustomerContact() {
		return customerContact;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public Address_1b getCustomerAddress() {
		return customerAddress;
	}
	
	public void getCustomerDetails() {
		System.out.println("Customer id: "+customerID+", Customer Name: "+customerName+" Contact No.: "+customerContact);
		System.out.println("Address: "+customerAddress);
	}
}
