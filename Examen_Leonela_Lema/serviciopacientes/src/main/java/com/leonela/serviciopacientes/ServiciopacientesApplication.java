package com.leonela.serviciopacientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ServiciopacientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciopacientesApplication.class, args);
	}

}
