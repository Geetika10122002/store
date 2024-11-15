package com.example.store.controller;

import com.example.store.entity.Product;
import com.example.store.entity.ProductDto;
import com.example.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repo;
    @GetMapping({"","/"})
    public String showProductList(Model model){
        List<Product> productList=repo.findAll();
        model.addAttribute("productList",productList);
        return "Products/index";
    }
    @GetMapping("/create")
    public String showCreatePage(Model model){
        ProductDto productDto=new ProductDto();
        model.addAttribute("productDto",productDto);
        return "Products/createProduct";
    }

}
