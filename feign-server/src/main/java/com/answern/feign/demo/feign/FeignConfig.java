package com.answern.feign.demo.feign;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Retryer;

//@Configuration
//public class FeignConfig {
//	
//	 @Bean
//	    public Retryer feignRetryer() {
//	        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 0); //重试间隔为100ms，最大重试时间为1s,重试次数为5次。
//	    }
//
//}
