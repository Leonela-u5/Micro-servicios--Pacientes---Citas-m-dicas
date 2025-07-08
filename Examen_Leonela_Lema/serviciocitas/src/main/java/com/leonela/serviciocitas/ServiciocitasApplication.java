package com.leonela.serviciocitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.leonela.serviciocitas.pacienteDTO")

public class ServiciocitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciocitasApplication.class, args);
	}

}
