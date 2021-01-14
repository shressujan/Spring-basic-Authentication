package com.spring.security.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String getHome(){
        return "home";
    }

    public String getAddress(){
        return "Nepal";
    }
}
