package com.spring.eureka.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

    @GetMapping("/pay/{price}")
    public String payNow(@PathVariable int price){
        return "Payment successfull with amount"+price;
    }

    @GetMapping("/")
    public String get(){
        return "Success";
    }
}