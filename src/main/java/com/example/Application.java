package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//HIS 134
		
	   ConfigurableApplicationContext run = SpringApplication.run(Application.class);
	   run.close();
	
	}


//HIS-200 Related Changes
        public void doProcess() {
  	//logic go here
	syso("Do Process");

 }

}
