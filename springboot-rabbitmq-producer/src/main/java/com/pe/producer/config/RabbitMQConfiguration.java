package com.pe.producer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pe.producer.constant.ApplicationConstant;

@Configuration
public class RabbitMQConfiguration {

	@Bean
	Queue queue() {
		return new Queue(ApplicationConstant.QUEUE, false);
	}

	@Bean
	DirectExchange directExchange() {
		return new DirectExchange(ApplicationConstant.EXCHANGE);
	}

	@Bean
	Binding binding(Queue queue, DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ApplicationConstant.ROUTING_KEY);
	}

}
