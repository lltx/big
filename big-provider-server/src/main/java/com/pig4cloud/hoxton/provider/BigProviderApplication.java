package com.pig4cloud.hoxton.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BigProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigProviderApplication.class, args);
	}

}
