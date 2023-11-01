package com.npci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer// enable this pgm as service discovery

public class ServiceDiscoveyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveyDemoApplication.class, args);
	}

}
