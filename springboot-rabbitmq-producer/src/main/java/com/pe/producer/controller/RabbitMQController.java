package com.pe.producer.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.producer.constant.ApplicationConstant;

@RestController
@RequestMapping("/api/amqp")
public class RabbitMQController {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@GetMapping("/producer")
	public String publishMessage() {
		amqpTemplate.convertAndSend(ApplicationConstant.EXCHANGE, ApplicationConstant.ROUTING_KEY,
				"Here i am placed here in RabbitMQ Server");
		return "MessagePlaced";
	}
}
