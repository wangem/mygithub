package com.answern.amqp.base;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * s生产消息
 * @author wem
 *
 */
public class SendMain {
	
 
	private final static String QUEUE_NAME = "hello";
	
	public static void main(String[] args) throws IOException, TimeoutException  {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setPort(5672);
		factory.setUsername("rabbimq");
		factory.setPassword("rabbimq");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, true, false, false, null);
		String message = "Hello World!7";
		channel.basicPublish("Topic", QUEUE_NAME, null, message.getBytes());
//		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		System.out.println(" [x] Sent '" + message + "'");
		channel.close();
		connection.close();
	}
}
