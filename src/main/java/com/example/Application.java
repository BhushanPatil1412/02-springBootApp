package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

private Map<String,Object> cache = new HashMap<String,Object>();
private static ginal string REST_URL="https://www.equifax.com/getScores"


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
//HIS - 301 changes
public void loaddatToCash() {
//logic
}

}
