package com.sbi.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@GetMapping("/ping")
	public String message() {
		logger.info("jenkins first pipeline demo started");
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}

	public static void main(String[] args) {
		logger.info("jenkins first pipeline application started");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}
}
