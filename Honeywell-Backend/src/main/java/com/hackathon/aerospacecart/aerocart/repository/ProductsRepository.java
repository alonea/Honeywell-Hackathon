package com.hackathon.aerospacecart.aerocart.repository;

import com.hackathon.aerospacecart.aerocart.models.Products;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<Products,String>{
    
}
