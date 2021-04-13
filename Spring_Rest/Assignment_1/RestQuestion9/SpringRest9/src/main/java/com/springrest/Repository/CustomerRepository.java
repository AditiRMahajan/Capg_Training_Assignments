package com.springrest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springrest.Model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}