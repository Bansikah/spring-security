package com.bansikah.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.Collections;

@SpringBootApplication
@EnableWebSecurity
public class SpringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringsecurityApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
	}

}
