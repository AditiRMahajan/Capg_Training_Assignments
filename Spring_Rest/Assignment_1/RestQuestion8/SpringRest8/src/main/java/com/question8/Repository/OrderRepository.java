package com.question8.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.question8.Model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,Long>{

}
