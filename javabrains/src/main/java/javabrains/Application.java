package javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This class must be located in the top hierarchy of packages

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
