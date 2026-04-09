package com.restaurant.bai2.service;


import com.restaurant.bai2.common.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService {
    public List<Dish> getAllDishes() {
        List<Dish> list = new ArrayList<>();

        list.add(new Dish(1, "Phở bò", 50000, true));
        list.add(new Dish(2, "Bún chả", 45000, true));
        list.add(new Dish(3, "Gỏi cuốn", 30000, false));

        return list;
    }
}