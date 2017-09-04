package com.answern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
@EnableDiscoveryClient
public class ZipkinServerStart {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinServerStart.class, args);
	}


}
