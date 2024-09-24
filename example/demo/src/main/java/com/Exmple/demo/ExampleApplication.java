package com.Exmple.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
	@Bean  //In Java, the @Bean annotation is used in the Spring Framework to define a method that produces a bean, which is a managed object in the Spring container.
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


}
