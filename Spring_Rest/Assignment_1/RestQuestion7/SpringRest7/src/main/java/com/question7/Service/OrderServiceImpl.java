package com.question7.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question7.Entity.Order;
import com.question7.Repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	public String placeOrder(Order order) {
		Order inserOrder=orderRepo.insert(order);
		return "Placed order Successfully for "+inserOrder.getOrderName()+"!!";
	}

	public Order updateOrder(Order order) {
		Optional<Order> tempOrder = orderRepo.findById(order.getOrderId());
		if(tempOrder.isPresent())
			orderRepo.save(order);
		return order;
	}

	public Optional<Order> viewOrderById(Long orderId) {
		return orderRepo.findById(orderId);
	}

	public List<Order> viewAllOrder() {
		return orderRepo.findAll();
	}

	public String deleteOrder(Long orderId) {
		orderRepo.deleteById(orderId);
		return "Order deleted successfully";
	}


}
