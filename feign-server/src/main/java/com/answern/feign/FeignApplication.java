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
	

//	 @Bean
//	    public Retryer feignRetryer() {
//	        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 9); //重试间隔为100ms，最大重试时间为1s,重试次数为5次。
//	    }
}
