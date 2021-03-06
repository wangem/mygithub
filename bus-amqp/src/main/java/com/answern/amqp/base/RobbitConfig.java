package com.answern.amqp.base;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 
/**
 * 配置队列,交换器,路由等高级信息
 * @author wem
 *
 */

@Configuration
public class RobbitConfig {

	 
    
	@Bean
	public Queue helloQueur() {
		
		return  new Queue("helloQueue");
	}
	 @Bean
    public Queue userQueue() {
        return new Queue("user");
    }
	 
  @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }
	    
	   //===============以下是验证topic Exchange的队列==========
	    @Bean
	    public Queue queueMessage() {
	        return new Queue("topic.message");
	    }

	    @Bean
	    public Queue queueMessages() {
	        return new Queue("topic.messages");
	    }
	  //===============以上是验证topic Exchange的队列==========
	    //===============以下是验证Fanout Exchange的队列==========
	    @Bean
	    public Queue AMessage() {
	        return new Queue("fanout.A");
	    }

	    @Bean
	    public Queue BMessage() {
	        return new Queue("fanout.B");
	    }

	    @Bean
	    public Queue CMessage() {
	        return new Queue("fanout.C");
	    }
	    //===============以上是验证Fanout Exchange的队列==========
	    
	    /**
	     * 将队列topic.message与exchange绑定，binding_key为topic.message,就是完全匹配
	     * @param queueMessage
	     * @param exchange
	     * @return
	     */
	    @Bean
	    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
	        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
	    }
	    /**
	     * 将队列topic.messages与exchange绑定，binding_key为topic.#,模糊匹配
	     * @param queueMessage
	     * @param exchange
	     * @return
	     */
	    @Bean
	    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
	        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
	    }
	    @Bean
	    Binding bindingExchangeA(Queue AMessage,FanoutExchange fanoutExchange) {
	        return BindingBuilder.bind(AMessage).to(fanoutExchange);
	    }

	    @Bean
	    Binding bindingExchangeB(Queue BMessage, FanoutExchange fanoutExchange) {
	        return BindingBuilder.bind(BMessage).to(fanoutExchange);
	    }

	    @Bean
	    Binding bindingExchangeC(Queue CMessage, FanoutExchange fanoutExchange) {
	        return BindingBuilder.bind(CMessage).to(fanoutExchange);
	    }
	    
	    
}
