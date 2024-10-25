package com.cts.fooddelivery.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cts.fooddelivery.*"})
public class FoodUserDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodUserDetailsApplication.class, args);
	}

}
