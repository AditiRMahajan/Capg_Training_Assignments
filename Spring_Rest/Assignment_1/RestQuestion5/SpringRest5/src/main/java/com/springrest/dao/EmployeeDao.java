package com.springrest.dao;

import com.springrest.employee.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
