package com.springrest.Services;

import java.util.*;

import com.springrest.employee.Employee;

public interface EmpServices {
    
    public Optional<Employee> findById(int id);
    public Employee addEmployee(Employee emp);
    public List<Employee> findAllEmployee();
    public Employee updateEmployee(Employee emp);
    public String deleteEmployee(int id);
}
