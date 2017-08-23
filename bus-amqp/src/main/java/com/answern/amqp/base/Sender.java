package com.answern.amqp.base;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
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
		
		String context = "hello"+ new Date(); 
		String string = UUID.randomUUID().toString();
		CorrelationData correlationId = new CorrelationData(string);  
		System.out.println("correlationId == "+correlationId);
//        rabbitTemplate.convertAndSend(AmqpConfig.EXCHANGE, AmqpConfig.ROUTINGKEY, content, correlationId);  
		 
		System.out.println("Sender："+ context);
		this.rebbitTemplate.convertAndSend("helloQueue",context);
	}
	 
}
