package com.jenkins_docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDocker1Application {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsDocker1Application.class);

	public static void main(String[] args) {
		logger.info("Main method is gettign executed...");
		logger.info("Main method is gettign executed 2...");
		SpringApplication.run(JenkinsDocker1Application.class, args);
	}

}
