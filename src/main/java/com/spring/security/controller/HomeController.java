package com.spring.security.controller;



import com.spring.security.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  @Autowired
  private HomeService homeService;

  @GetMapping("/home")
  public void home() {
    homeService.getHome();
  }
  @GetMapping("/address")
  public void address(){
    homeService.getAddress();
  }
}
