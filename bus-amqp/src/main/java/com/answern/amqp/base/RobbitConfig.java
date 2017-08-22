package com.answern.amqp.base;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 


@Configuration
public class RobbitConfig {

	@Bean
	public Queue helloQueur() {
		
		return  new Queue("hello");
	}
}
