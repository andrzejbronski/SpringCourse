package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.MessagePrinter;
import beans.MessageProducer;
import beans.SimpleMessageProducer;

@Configuration
public class ApplicationConfig {

    @Bean
    public MessagePrinter getPrinter() {
        MessageProducer producer = new SimpleMessageProducer();
        return new MessagePrinter(producer);
    }
}