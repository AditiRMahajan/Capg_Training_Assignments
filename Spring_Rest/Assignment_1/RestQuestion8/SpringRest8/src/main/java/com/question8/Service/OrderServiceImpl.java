package com.question8.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question8.Model.Order;
import com.question8.Repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
    OrderRepository orderRepository;

	@Override
	public String addProduct(Order order) {
		Order inserOrder=orderRepository.insert(order);
		return "Placed order Successfully for "+inserOrder.getOrderId()+"!!";
	}

	@Override
	public Order updateProduct(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public String deleteProduct(Long orderId) {
		orderRepository.deleteById(orderId);
        return "Order Cancelled!!";
	}

	@Override
	public Optional<Order> viewProductById(Long orderId) {
		return orderRepository.findById(orderId);
	}

	@Override
	public List<Order> viewAllProducts() {
		return orderRepository.findAll();
	}

}
