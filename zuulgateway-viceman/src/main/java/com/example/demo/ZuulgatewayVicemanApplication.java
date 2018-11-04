package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
public class ZuulgatewayVicemanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgatewayVicemanApplication.class, args);
	}
}
