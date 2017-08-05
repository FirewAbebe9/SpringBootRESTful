package edu.mum.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.mum")
public class CoffeShopApplication {
// This is the application class that starts the project
	public static void main(String[] args) {
		SpringApplication.run(CoffeShopApplication.class, args);
	}
}