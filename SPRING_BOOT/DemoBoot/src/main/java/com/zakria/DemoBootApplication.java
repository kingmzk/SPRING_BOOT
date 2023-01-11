package com.zakria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication    //By default
public class DemoBootApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context  = SpringApplication.run(DemoBootApplication.class, args); //here container is created
	
	
	Alien a = context.getBean(Alien.class);
	a.show();
	
	
	
	Alien a1 = context.getBean(Alien.class);
	a1.show();
	
	
	
	
	}

}
