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
	
	@GetMapping("/employee")
        public String run(){
		return "Welcome to Employee Management System!";
        }
	
	@GetMapping("findEmployee/{id}")
	public Optional<Employee> findById(@PathVariable String id){
                return es.findById(Integer.parseInt(id));
        }
	
	@GetMapping("/findAllEmployees")
        public List<Employee> findAllEmployee(){
                return es.findAllEmployee();
        }
	
	 @PostMapping("/addEmployee")
	 public Employee addDetail(@RequestBody Employee emp) {
		return es.addEmployee(emp);
	}
	 
	 @PutMapping("/updateEmployee")
	 public Employee updateDetail(@RequestBody Employee emp) {
		return es.updateEmployee(emp);
	 }
	 
	 @DeleteMapping("/deleteEmployee/{id}")
	 public String deletedetails(@PathVariable String id){
	        return es.deleteEmployee(Integer.parseInt(id));
	    }


}
