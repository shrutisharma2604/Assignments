package com.example.RabbitMqListener;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {

    // Queue Creation
    //1.
    @Bean
    Queue ExampleQueue(){
        return new Queue("ExampleQueue",false);
    }

    //2.
    @Bean
    Queue Example2Queue(){
        return QueueBuilder.durable("Example2Queue")
                .autoDelete()
                .exclusive()
                .build();
    }
}
