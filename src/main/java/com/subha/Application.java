package com.subha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subha.service.ServiceDemo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt  
		= SpringApplication.run(Application.class, args);
		
		ServiceDemo service = ctxt.getBean(ServiceDemo.class);
		
		service.saveData();
	}

}
