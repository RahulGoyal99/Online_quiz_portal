package com.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.business")
@EntityScan(basePackages = "com.business.bean")
public class OnlineQuizPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizPortalApplication.class, args);
		//System.out.println("Server Running...");
	}

}
