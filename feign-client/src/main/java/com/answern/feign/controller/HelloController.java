package com.answern.feign.controller;

import java.util.Date;
import java.util.Random;

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
		System.out.println("进入hello");
		long sttime = new Date().getTime();
		int nextInt = new Random().nextInt(3000);
		try {
			Thread.sleep(nextInt);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		long entime = new Date().getTime();
		System.out.println("沉睡了:"+ ( nextInt/1000 )+"秒");
		return "这里是feign-client的hello返回:"+ (entime -sttime  );

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
	@RequestMapping(value = "helloexception" , method=RequestMethod.GET)
	public String   helloexception() throws Exception { 
			throw new Exception("this is a exception");
	}

}
