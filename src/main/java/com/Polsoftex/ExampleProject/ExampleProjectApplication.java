package com.Polsoftex.ExampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleProjectApplication.class, args);
	}

}
