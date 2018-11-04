package com.viceman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DatamuseVicemanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatamuseVicemanApplication.class, args);
	}
}
