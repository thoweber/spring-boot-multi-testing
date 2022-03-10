package com.example.springone2021.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springone2021")
public class Springone2021Application {

	public static void main(String[] args) {
		SpringApplication.run(Springone2021Application.class, args);
	}

}
