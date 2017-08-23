package com.answern.amqp.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

 

@RunWith(SpringRunner.class)
@SpringBootTest 
public class SenderTests {

	@Autowired
	private Sender sender;
	@Autowired
	private Receiver receiver;
	
	@Test
	public void sender() {
		sender.send();
	}
//	@Test
//	public void receiver() {
//		receiver.process("这是一个消费者");
//	}
}
