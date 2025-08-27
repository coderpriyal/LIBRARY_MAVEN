package com.example.LibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Library library= (Library) context.getBean("library");
		library.displayDetails();
	}

}
