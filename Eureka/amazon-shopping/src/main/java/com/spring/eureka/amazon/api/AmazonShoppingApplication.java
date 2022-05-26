package com.spring.eureka.amazon.api;

import com.spring.eureka.amazon.controller.ShoppingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackageClasses= ShoppingController.class)
public class AmazonShoppingApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingApplication.class, args);
	}


}
