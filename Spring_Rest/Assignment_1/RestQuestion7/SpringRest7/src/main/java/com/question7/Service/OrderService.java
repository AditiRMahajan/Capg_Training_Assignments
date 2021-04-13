package com.question7.Service;

import java.util.*;

import com.question7.Entity.Order;

public interface OrderService {
	public String placeOrder(Order order);
	public Order updateOrder(Order order);
	public Optional<Order> viewOrderById(Long orderId);
	public List<Order> viewAllOrder();
	public String deleteOrder(Long orderId);
}
