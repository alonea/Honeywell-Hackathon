package com.hackathon.aerospacecart.aerocart.service;

import java.util.List;

import com.hackathon.aerospacecart.aerocart.models.Products;
import com.hackathon.aerospacecart.aerocart.repository.ProductsRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
    
    public List<Products> getAllProducts(){
        return productsRepository.findAll();
    }
}
