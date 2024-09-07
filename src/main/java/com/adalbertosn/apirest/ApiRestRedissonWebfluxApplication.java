package com.adalbertosn.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ApiRestRedissonWebfluxApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiRestRedissonWebfluxApplication.class, args);
		System.out.println("ok");
	}
}
