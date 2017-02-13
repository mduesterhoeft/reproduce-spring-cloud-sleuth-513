package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReproduceSpringCloudSleuth513Application {

	public static void main(String[] args) {
		SpringApplication.run(ReproduceSpringCloudSleuth513Application.class, args);
	}
}
