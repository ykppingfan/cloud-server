package com.ykp.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "com.ykp.cloudserver")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
