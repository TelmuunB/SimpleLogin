package com.springBootLogin.codingTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.springBootLogin.entity")
public class CodingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingTestApplication.class, args);
	}

}
