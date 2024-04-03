package com.CosmosMongoApp;

import com.CosmosMongoApp.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {UserController.class})
public class CosmosMongoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmosMongoAppApplication.class, args);
	}

}
