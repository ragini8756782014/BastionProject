package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@ComponentScan(basePackages = {"com.example.demo.service","com.example.demo.configuration"})
////@PropertySource("classpath:application.properties")
//@EnableJpaRepositories(basePackages = "com.example.demo.respository")
@SpringBootApplication
public class BastionApplication {
	public static void main(String[] args) {
		SpringApplication.run(BastionApplication.class, args);
	}

}
