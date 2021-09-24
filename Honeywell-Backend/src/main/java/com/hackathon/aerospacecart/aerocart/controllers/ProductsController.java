package com.hackathon.aerospacecart.aerocart.controllers;

import java.util.List;

import com.hackathon.aerospacecart.aerocart.models.Products;
import com.hackathon.aerospacecart.aerocart.service.ProductsService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @CrossOrigin
    @GetMapping("/")
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> products = productsService.getAllProducts();
        if (products != null) {
            return ResponseEntity.ok(products);
        }
        return ResponseEntity.notFound().build();
    }
}
