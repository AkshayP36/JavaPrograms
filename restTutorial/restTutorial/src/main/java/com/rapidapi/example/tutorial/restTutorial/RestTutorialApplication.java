package com.rapidapi.example.tutorial.restTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rapidapi.example.tutorial.restTutorial.*")
public class RestTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTutorialApplication.class, args);
	}

}

//issue :- base package