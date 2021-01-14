package com.spring.security.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public void getHome(){
        System.out.println("home");
    }

    public void getAddress(){
        System.out.println("address");
    }
}
