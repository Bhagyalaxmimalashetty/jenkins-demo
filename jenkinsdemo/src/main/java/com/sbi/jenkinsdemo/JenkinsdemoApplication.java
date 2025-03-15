package com.sbi.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplicationTests.class);

	@GetMapping("/ping")
	public String message() {
		looger.info("jenkins first pipeline demo started")
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}

	public static void main(String[] args) {
		looger.info("jenkins first pipeline application started")
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}
}
