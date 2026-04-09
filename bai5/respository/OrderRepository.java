package com.restaurant.bai5.respository;

import com.restaurant.bai5.common.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private static final List<Order> orders = new ArrayList<>();

    static {
        orders.add(new Order(1, "Phở bò", 2, 50000));
        orders.add(new Order(2, "Bún chả", 1, 45000));
    }

    public Order findById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
    }
}