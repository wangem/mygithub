package com.answern.amqp.base;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

/**
 * 消费者端
 * @author wem
 *
 */
@SuppressWarnings("deprecation")
public class RabbitMQRecvMain {
	private final static String QUEUE_NAME = "hello";
	public static void main(String avg[]) throws IOException, TimeoutException, ShutdownSignalException, ConsumerCancelledException, InterruptedException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setPort(5672);
		factory.setUsername("rabbimq");
		factory.setPassword("rabbimq");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
//		channel.queueDeclare(queue, durable, exclusive, autoDelete, arguments)
		channel.queueDeclare(QUEUE_NAME, true, false, false, null);
		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
		QueueingConsumer consumer = new QueueingConsumer(channel);
		channel.basicConsume(QUEUE_NAME, true, consumer);
		while (true) {
		QueueingConsumer.Delivery delivery = consumer.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(" [x] Received '" + message + "'");
		}
	}

}
