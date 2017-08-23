package com.answern.amqp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.answern.amqp.base.Sender;

@RestController
@RequestMapping("/rabbit")
public class RabbitTestController {
	
	@Autowired
	Sender sender;
	
	@RequestMapping("/hello")
    public String hello() {
		 System.out.println("进入hello");
		 sender.send();
		 System.out.println("sender ok");
		 return "生产成功!";
    }

}
