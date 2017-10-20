package com.answern.feign.demo.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignExceptionFallBack implements HelloFeignException {

	@Override
	public String helloexception() {
		// TODO Auto-generated method stub
		return "this is fallBack";
	}

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "this is fallBack Name";
	}

	 
}
