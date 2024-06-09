package com.wanch_coach.wc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WcApplication.class, args);
	}

}
