package com.example.hiberusbilling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HiberusBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiberusBillingApplication.class, args);
	}

}
