package com.question7.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.question7.Entity.Order;
import com.question7.Service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
    OrderService orderService;
	
	@GetMapping("/")
    public String run() {
        return "Welcome to Ordering App!!";
    }
	
	@PostMapping("/placeOrder")
    public String PlaceOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }
	
	@PostMapping("/updateOrder")
	public Order UpdateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}
	 
	@GetMapping("/viewOrder/{orderId}")
	public Optional<Order> viewOrderById(@PathVariable Long orderId) {
		return orderService.viewOrderById(orderId);
	    }
	
	@GetMapping("/viewAllOrder")
    public List<Order> viewAllOrder() {
		return orderService.viewAllOrder();

    }
	
	@GetMapping("/deleteOrder/{orderId}")
	public String deleteOrder(@PathVariable Long orderId) {
		return orderService.deleteOrder(orderId);
	}

}
