package com.answern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerStart {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinServerStart.class, args);
	}


}
