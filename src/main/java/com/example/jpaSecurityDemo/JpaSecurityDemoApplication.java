package com.example.jpaSecurityDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class JpaSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSecurityDemoApplication.class, args);
	}

}
