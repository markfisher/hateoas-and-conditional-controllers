package com.greglturnquist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableHypermediaSupport(type = HAL)
public class HateoasAndConditionalControllersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateoasAndConditionalControllersApplication.class, args);
	}
}
