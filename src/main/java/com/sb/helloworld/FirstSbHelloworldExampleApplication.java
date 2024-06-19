package com.sb.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSbHelloworldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSbHelloworldExampleApplication.class, args);

		System.out.println("This is first spring boot application");
		System.out.println("Github first commit test");
	}

}
