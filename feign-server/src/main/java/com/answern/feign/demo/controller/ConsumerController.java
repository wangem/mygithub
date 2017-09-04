package com.answern.feign.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.answern.feign.demo.config.ReadConfig;
import com.answern.feign.demo.feign.HelloService;
import com.answern.feign.demo.model.User;

@RestController
public class ConsumerController {

	@Autowired
	HelloService helloService;
	@Autowired
	ReadConfig readConfig;
	
 

	
	@RequestMapping(value = "feign-consumer" , method=RequestMethod.GET)
	public String  helloConsumer() {
		
		return helloService.hello();

	}
	@RequestMapping(value = "feign-hello" , method=RequestMethod.GET)
	public String  hello() {
		StringBuilder sb =  new StringBuilder();
		sb.append(helloService.hello()).append("\n");
		sb.append(helloService.hello(" 名字 ")).append("\n");
		sb.append(helloService.hello(" 名字 ",30)).append("\n");
		sb.append(helloService.hello(new User("名字 ",30))).append("\n");
		
		return sb.toString();
		
	}
//	@RequestMapping(value = "ownerTitle" , method=RequestMethod.GET)
//	public String  ownerTitle() {
////		OwnerAutoConfiguration ownerAutoConfiguration = null;
////		 String title = ownerreturn.g.ownerreturn();
//		System.out.println("ownerAutoConfiguration= "+title);
//		return title; 
//	}
	

}
