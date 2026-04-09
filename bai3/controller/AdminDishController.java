package com.restaurant.bai3.controller;

import com.restaurant.bai2.common.Dish;
import com.restaurant.bai3.service.AdminDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminDishController {
    private final AdminDishService service;

    @Autowired
    public AdminDishController(AdminDishService service) {
        this.service = service;
    }

    @GetMapping("/bai3/edit/{id}")
    public String editDish(@PathVariable int id,
                           Model model,
                           RedirectAttributes redirectAttributes) {

        Dish dish = service.getDishById(id);

        if (dish == null) {
            redirectAttributes.addFlashAttribute("error", "Không tìm thấy món ăn yêu cầu");
            return "redirect:/bai2/dishes";
        }

        model.addAttribute("dish", dish);
        return "edit-dish";
    }
}
