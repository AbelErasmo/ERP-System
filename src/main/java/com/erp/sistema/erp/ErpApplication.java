package com.erp.sistema.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
		System.out.println("ERP Application is running...");
		System.out.println("Spring Boot version: " + SpringApplication.class.getPackage().getImplementationVersion());
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("Java home: " + System.getProperty("java.home"));
	}

}
