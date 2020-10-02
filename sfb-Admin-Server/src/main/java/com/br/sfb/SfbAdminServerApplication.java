package com.br.sfb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableAdminServer
@SpringBootApplication
public class SfbAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfbAdminServerApplication.class, args);
	}

}
