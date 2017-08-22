package com.answern.amqp.base;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 * @author wem
 *
 */
@Component
public class Sender {
	@Autowired
     private AmqpTemplate rebbitTemplate;
	public void send() {
		String context = "hello 生产者"+ new Date();
		System.out.println("Sender："+ context);
		this.rebbitTemplate.convertAndSend("hello",context);
	}
	 
}
