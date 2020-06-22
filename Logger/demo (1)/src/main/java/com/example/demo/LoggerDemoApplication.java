package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoggerDemoApplication {
	private static final Logger LOGGER= LoggerFactory.getLogger(LoggerDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoggerDemoApplication.class, args);
		LOGGER.error("Message Logged at Error level");
		LOGGER.warn("Message Logged at Warn level");
		LOGGER.info("Message Logged at Info level");
		LOGGER.debug("Message Logged at Debug level");
	}

	@RequestMapping("/")
	public String welcome(){
		return "hello";
	}

}
