package com.restaurant.bai5.controller;

import com.restaurant.bai5.common.Order;
import com.restaurant.bai5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DishDetailController {
    private final OrderService service;

    @Autowired
    public DishDetailController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/bai5/order/{id}")
    public String getOrderDetail(@PathVariable int id,Model model,RedirectAttributes redirectAttributes) {
        Order order = service.getOrderDetail(id);

        if (order == null) {
            redirectAttributes.addFlashAttribute("error","Không tìm thấy đơn hàng");
            return "redirect:/bai2/dishes";
        }

        model.addAttribute("order", order);
        return "order-detail";
    }
}