package com.answern.feign.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.answern.feign.demo.feign.HelloFeign;

@RestController
@RequestMapping("hello" )
public class HelloFeignController {

	@Autowired
	HelloFeign helloFeign;
	
	
	@RequestMapping(value = "index" , method=RequestMethod.GET)
	public String  index() {
		
		return helloFeign.hello();

	}

}
