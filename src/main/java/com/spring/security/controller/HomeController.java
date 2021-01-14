package com.spring.security.controller;


import com.spring.security.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Autowired
  private HomeService homeService;

  @GetMapping("/home")
  public String home() {
    return homeService.getHome();
  }
  @GetMapping("/address")
  public String address(){
    return homeService.getAddress();
  }
}
