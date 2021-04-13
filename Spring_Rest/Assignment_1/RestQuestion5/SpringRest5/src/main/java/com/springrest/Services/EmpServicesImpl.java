package com.springrest.Services;

import java.util.*;

import com.springrest.employee.Employee;
import com.springrest.dao.EmployeeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServicesImpl implements EmpServices {
	
	@Autowired
	private EmployeeDao empdao;
	

	public Employee addEmployee(Employee emp) {
		return empdao.save(emp);
	}
	

	public Optional<Employee> findById(int id) {
		return empdao.findById(id);
	}
	
	
	public List<Employee> findAllEmployee() {
		List<Employee> e=new ArrayList<Employee>();
		empdao.findAll().forEach(e::add);
		return e;
	}
	

	public Employee updateEmployee(Employee emp) {
		return empdao.save(emp);
	}
	

	public String deleteEmployee(int id) {
		empdao.deleteById(id);
		return "Successful";
	}

}
