package com.mounika.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Browse_Books {
	public static void main(String args[]) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		//Head_Library library = (Head_Library) context.getBean("library"); //Dependency injection
		SpringApplication.run(Browse_Books.class, args);
		/*System.out.println(getGenre());
		System.out.println(getBookTitle());
		System.out.println(getAuthor());
		System.out.println(getEdition());
		System.out.println(getAvailability());*/
	}

}
