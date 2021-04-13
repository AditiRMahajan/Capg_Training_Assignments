package com.springrest.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Model.Customer;
import com.springrest.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}

	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}

	public void deleteCustomer(Integer custId) {
		customerRepository.deleteById(custId);
		
	}

	public Optional<Customer> fetchCustomerById(Integer custId) {
		 return customerRepository.findById(custId);
	}

	public Iterable<Customer> fetchAllCustomer() {
		return customerRepository.findAll();
	}

}
