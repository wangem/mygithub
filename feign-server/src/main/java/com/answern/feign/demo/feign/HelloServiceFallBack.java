package com.answern.feign.demo.feign;

import org.springframework.stereotype.Component;

import com.answern.feign.demo.model.User;

@Component
public class HelloServiceFallBack implements HelloService {

	@Override
	public String hello() {
		return "错误";
	}

	@Override
	public String hello(String name) {
		return "错误";
	}

	@Override
	public User hello(String name, Integer age) {
		return new User("错误",0);
	}

	@Override
	public String hello(User user) { 
		return "错误";
	}

}
