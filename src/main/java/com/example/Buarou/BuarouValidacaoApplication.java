package com.example.Buarou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BuarouValidacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuarouValidacaoApplication.class, args);
	}

}
