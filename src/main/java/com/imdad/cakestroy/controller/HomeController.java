package com.imdad.cakestroy.controller;

import com.imdad.cakestroy.service.CategoryService;
import com.imdad.cakestroy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;
    @Autowired
     CategoryService categoryservice;

    @GetMapping({"/", "/home"})

    public String home(Model model) {
        return "index";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("categories",categoryservice.getAllCategories());
        model.addAttribute("products",productService.getAllProduct());
        return "shop";
    }
    @GetMapping("/shop/category/{id}")
    public String shopByCategory(Model model,@PathVariable int id) {
        model.addAttribute("categories",categoryservice.getAllCategories());
        model.addAttribute("products",productService.getAllProductsByCategoryId(id));
        return "shop";
    }
    @GetMapping("/shop/viewproduct/{id}")
    public String viewByCategoryId(Model model,@PathVariable int id) {

        model.addAttribute("product",productService.getProductById(id).get());
        return "viewProduct";
    }

}
