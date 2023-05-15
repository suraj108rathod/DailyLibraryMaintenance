package com.jspider.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.jspider.userrepository")

@EntityScan(basePackages="com.example.spring")

@SpringBootApplication(scanBasePackages="com.springdemo.controller")
public class Springdemo1Application
{
	public static void main(String[] args) {
		SpringApplication.run(Springdemo1Application.class, args);
	}
}

