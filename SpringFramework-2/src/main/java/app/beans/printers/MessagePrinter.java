package app.beans.printers;

import app.beans.decorators.MessageDecorator;
import app.beans.producers.Message;
import app.beans.producers.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    @Autowired
    @Message(type = Message.MessageType.FILE)
    private MessageProducer producer;

    public void print() {
        System.out.println("Message produced: "+producer.getMessage());
    }
}