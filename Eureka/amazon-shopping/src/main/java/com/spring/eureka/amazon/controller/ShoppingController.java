package com.spring.eureka.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping-provider")
public class ShoppingController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/payment")
    public String payment(){
        return restTemplate.getForObject("http://PAYMENT-SERVICE/payment-provider/pay/23",String.class);
    }
}
