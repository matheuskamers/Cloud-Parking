package com.springboot.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CloudParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudParkingApplication.class, args);
	}

}
