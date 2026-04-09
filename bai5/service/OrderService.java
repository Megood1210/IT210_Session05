package com.restaurant.bai5.service;

import com.restaurant.bai5.common.Order;
import com.restaurant.bai5.respository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository repo;

    @Autowired
    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order getOrderDetail(int id) {
        Order order = repo.findById(id);

        if (order == null) return null;

        return order;
    }
}