package com.example.MatchMaking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MatchMakingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchMakingApplication.class, args);
	}

}
