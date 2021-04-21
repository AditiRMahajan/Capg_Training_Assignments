package com.javatechie.rabbitmq.demo.dto;

import lombok.Data;

@Data
public class OrderStatus {

    private Order order;
    private String status;//progress,completed
    private String message;
    public Order getOrder() {
        return order;
    }

    public OrderStatus() {
    }

    public OrderStatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "OrderStatus [message=" + message + ", order=" + order + ", status=" + status + "]";
    }

}
