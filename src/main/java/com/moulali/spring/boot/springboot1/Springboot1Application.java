package com.moulali.spring.boot.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
	
     @GetMapping("/")
     public String home(){
         return "Hello World!";
     }

}
