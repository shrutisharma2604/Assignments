package com.example.RabbitMqListener;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqExchangeConfig {

    //Exchange creation
    //1.
    @Bean
    Exchange exampleExchange(){
        return new TopicExchange("ExampleExchange");
    }
    //2.
    @Bean
    Exchange example2Exchange(){
        return ExchangeBuilder.directExchange("Example2Exchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange newExchange(){
        return ExchangeBuilder.topicExchange("TopicTestExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }

    @Bean
    FanoutExchange fanoutExchange(){
        return ExchangeBuilder.fanoutExchange("FanOutTestExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }

    @Bean
    HeadersExchange headersExchange(){
        return ExchangeBuilder.headersExchange("HeadersTestExchange")
                .durable(true)
                .internal()
                .ignoreDeclarationExceptions()
                .build();
    }
}
