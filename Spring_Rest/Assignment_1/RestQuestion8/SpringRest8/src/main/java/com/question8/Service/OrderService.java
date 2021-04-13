package com.question8.Service;

import java.util.*;

import com.question8.Model.Order;

public interface OrderService {
	 public String addProduct(Order order);
	 public Order updateProduct(Order order);
	 public String deleteProduct(Long orderId);
	 public Optional<Order> viewProductById(Long orderId);
	 public List<Order> viewAllProducts();

}
