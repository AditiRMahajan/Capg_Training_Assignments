package com.springrest.controller;

import java.util.*;

import com.springrest.employee.Employee;
import com.springrest.Services.EmpServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
	
	@Autowired
	private EmpServices es;
	
	@GetMapping("/")
    public String run(){
        return "Welcome to Employee Management System!";
    }
	
	@GetMapping("/{id}")
	public Optional<Employee> findById(@PathVariable String id){
        return this.es.findById(Integer.parseInt(id));
    }
	
	@GetMapping("/findAll")
    public List<Employee> findAllEmployee(){
        return this.es.findAllEmployee();
    }
	
	 @PostMapping("/")
	 public Employee addDetail(@RequestBody Employee emp) {
		 return this.es.addEmployee(emp);
	}
	 
	 @PutMapping("/")
	 public Employee updateDetail(@RequestBody Employee emp) {
		 return this.es.updateEmployee(emp);
	 }
	 
	 @DeleteMapping("/{id}")
	 public String deletedetails(@PathVariable String id){
	        return this.es.deleteEmployee(Integer.parseInt(id));
	    }


}
