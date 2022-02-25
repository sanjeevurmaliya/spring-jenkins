package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	
	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	/*@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
       logger.info("init() : application started ");
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		logger.info("main : Application executed ");
	}

}
