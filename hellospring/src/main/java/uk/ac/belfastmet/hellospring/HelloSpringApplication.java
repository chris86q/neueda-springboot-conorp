package uk.ac.belfastmet.hellospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
	private static final Logger logger = LoggerFactory.getLogger(HelloSpringApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		logger.info("Hello Spring Boot");
		// Comment for testing
	}
}
