package com.hackathon.aerospacecart.aerocart.controllers;

import com.hackathon.aerospacecart.aerocart.models.Order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrdersController {
    @CrossOrigin
    @GetMapping("/orders")
    public ResponseEntity<Order> getOrderDetails(){
        return ResponseEntity.ok().build();
    }
}
