package com.example.template.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Sender() {
    }
}
