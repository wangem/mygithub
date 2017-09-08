package com.answern.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.Logger;

@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
	
	@Bean
    Logger.Level feginLoggerLevel(){ 
        return Logger.Level.FULL;
    }
	
 
}
