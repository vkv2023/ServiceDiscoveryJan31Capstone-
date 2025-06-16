package com.example.ServiceDiscoveryJan31Capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryJan31CapstoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryJan31CapstoneApplication.class, args);
	}

}
