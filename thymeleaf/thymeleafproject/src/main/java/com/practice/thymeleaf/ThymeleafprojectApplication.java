package com.practice.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.practice")
public class ThymeleafprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafprojectApplication.class, args);
	}

}
                