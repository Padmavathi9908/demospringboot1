package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {
	// @Autowired
	// Alien alien;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);

		// System.out.println("wellcom");
		Alien a = context.getBean(Alien.class);
		a.show();
//		Alien a1 = context.getBean(Alien.class);
//		a.show();

	}

}
