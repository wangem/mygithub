package com.answern.feign.demo.feign;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.exception.HystrixTimeoutException;

import feign.FeignException;
import feign.hystrix.FallbackFactory;

@Component
public class HelloFeignExceptionFacty  implements FallbackFactory<HelloFeignException> {

	 
	
	@Override
	public HelloFeignException create(Throwable throwable) {
		
		String message = "";
		 
		if(throwable instanceof HystrixTimeoutException) {
			throwable.getMessage();
		}
		if(throwable instanceof FeignException) {
			throwable.getMessage();
		}
		
		return new HelloFeignException() {

			@Override
			public String helloexception() {
				return message;
			}
			@Override
			public String hello(String name) {
				return message;
			}
			
		};
	}

}
