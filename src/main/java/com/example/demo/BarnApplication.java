package com.example.demo;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BarnApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BarnApplication.class, args);
	
	Object byName = context.getBean("greeting");
	String byType = context.getBean(String.class);
	String byBoth = context.getBean("greeting", String.class);
	
	System.out.println(byName);
	System.out.println(byType);
	System.out.println(byBoth);
	
	Object byName2 = context.getBean("getCurrentLocalTime");
	LocalTime byType2 = context.getBean(LocalTime.class);
	LocalTime byBoth2 = context.getBean("getCurrentLocalTime", LocalTime.class);
	
	System.out.println(byName2);
	System.out.println(byType2);
	System.out.println(byBoth2);
	
	
	}
	
	@Bean
	public String greeting() {
		return "Hello World";
	}
	
	@Bean
	public LocalTime getCurrentLocalTime() {
		//String localTimeString =  LocalTime.now().toString();
		return LocalTime.now();
	}

}
