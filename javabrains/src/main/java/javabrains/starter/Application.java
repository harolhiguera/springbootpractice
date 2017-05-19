package javabrains.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
		//Sets up default configuration
		//Starts Spring application context
		//Performs class path scan
		//Starts Tomcat server 
	}
	
}
