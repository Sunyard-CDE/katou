package com.sunyard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KatouApplication {

	public static void main(String[] args) {
		SpringApplication.run(KatouApplication.class, args);
	}
}
