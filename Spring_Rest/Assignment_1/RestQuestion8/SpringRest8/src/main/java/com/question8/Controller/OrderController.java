package com.question8.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.question8.Model.Order;
import com.question8.Service.OrderService;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;
    
    @GetMapping("/orders")
    public String run() {
        return "Welcome to Ordering App!!";
    }

    @PostMapping("/addOrder")
    public String AddOrder(@RequestBody Order order) {
        return orderService.addProduct(order);
    }
    
    @GetMapping("/viewOrder/{orderId}")
    public Optional<Order> viewOrder(@PathVariable Long orderId) {
        return orderService.viewProductById(orderId);
    }
    
    @GetMapping("/viewAllOrders")
    public List<Order> viewAllOrder() { 
    	return orderService.viewAllProducts();
    }

    @PutMapping("/updateOrder") 
    public Order updateOrder(@RequestBody Order order) {
        return orderService.updateProduct(order);
    }

    @DeleteMapping("/deleteOrder/{orderId}") 
    public String deleteOrder(@PathVariable Long orderId) {
        return orderService.deleteProduct(orderId);
    }

}
