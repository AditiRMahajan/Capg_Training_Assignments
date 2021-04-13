package com.springrest.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.Model.Customer;
import com.springrest.Service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	 @Autowired
	    CustomerServiceImpl customerService;

	    @GetMapping("/customer")
	    public String run(){
	        return "Welcome Customers!";
	    }
	    
	    @PostMapping("/addCustomer")
	    public Customer addCustomer1(@RequestBody Customer customer) {
	    	return this.customerService.addCustomer(customer);
	    }
	    
	    @PutMapping("/updateCustomer")
	    public Customer updateCustomer(@RequestBody Customer Customer) {
	        return customerService.updateCustomer(Customer);
	    }
	    
	    @DeleteMapping("/deleteCustomer/{custId}")
	    public void deleteCustomer(@PathVariable Integer custId) {
	        customerService.deleteCustomer(custId);
	    }

	    @GetMapping("/fetchCustomer/{custId}")
	    public Optional<Customer> fetchCustomer(@PathVariable Integer custId) {
	        return customerService.fetchCustomerById(custId);
	    }

	    @GetMapping("/fetchAllCustomer")
	    public ArrayList<Customer> fetchAllCustomer() {
	        return (ArrayList<Customer>) customerService.fetchAllCustomer();
	    }

	   

}
