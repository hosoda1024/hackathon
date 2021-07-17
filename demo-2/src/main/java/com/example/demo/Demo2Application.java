package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.HelloService;

@SpringBootApplication
public class Demo2Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);
		
		HelloService service = ctx.getBean(HelloService.class);
		
		service.hello();
		
	}

}
