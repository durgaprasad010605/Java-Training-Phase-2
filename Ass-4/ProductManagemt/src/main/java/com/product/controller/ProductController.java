package com.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }
    @PostMapping("/update/{name}")
    public String UpdateQuantity(@PathVariable String name, @RequestParam int quantity) {
        Product product = repository.findByProductName(name);
        product.setQuantity(quantity);
        repository.save(product);
        return "Updated Quantity successfully";
    }
    @GetMapping("/getall")
    public List<Product> getProducts() {
        return repository.findAll();
    }
    
}