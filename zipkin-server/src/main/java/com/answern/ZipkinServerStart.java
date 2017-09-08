package com.answern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

//import zipkin.server.EnableZipkinServer;

//@EnableZipkinServer
@EnableZipkinStreamServer
@SpringBootApplication
//@EnableDiscoveryClient
public class ZipkinServerStart {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinServerStart.class, args);
	}


}
