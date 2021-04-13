package com.question8.Repository;

import org.springframework.stereotype.Repository;

import com.question8.Model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

}