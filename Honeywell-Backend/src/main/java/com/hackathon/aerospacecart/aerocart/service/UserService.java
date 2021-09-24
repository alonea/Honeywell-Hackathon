package com.hackathon.aerospacecart.aerocart.service;

import com.hackathon.aerospacecart.aerocart.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
