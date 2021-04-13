package com.springrest.Service;

import java.util.*;

import com.springrest.Model.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(Integer custId);
	public Optional<Customer> fetchCustomerById(Integer custId);
	public Iterable<Customer> fetchAllCustomer();
	
}
