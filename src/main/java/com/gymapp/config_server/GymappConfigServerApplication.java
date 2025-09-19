package com.gymapp.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GymappConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GymappConfigServerApplication.class, args);
	}

}
