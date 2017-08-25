package com.answern.feign.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.answern.feign.model.User;

@RestController
public class HelloController {
	
	@RequestMapping(value = "hello" , method=RequestMethod.GET)
	public String  helloConsumer() {
		
		return "这里是feign-client的hello返回";

	}
	@RequestMapping(value = "hello1" , method=RequestMethod.GET)
	public String  hello(@RequestParam String name) {
		
		return "Hello "+ name;
	}
	@RequestMapping(value = "hello2" , method=RequestMethod.GET)
	public User  hello(@RequestHeader String name ,@RequestHeader Integer age) {
		
		return new User(name ,age);
	}
	@RequestMapping(value = "hello3" , method=RequestMethod.POST)
	public String   hello(@RequestBody User user) {
		
		return "Hello "+ user.getName()+", "+ user.getAge();
	}

}
