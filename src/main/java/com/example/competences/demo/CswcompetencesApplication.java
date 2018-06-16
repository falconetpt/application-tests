package com.example.competences.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
public class CswcompetencesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CswcompetencesApplication.class, args);
	}
}
