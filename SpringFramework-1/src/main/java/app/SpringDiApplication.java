package app;

import beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.print();
        ctx.close();
    }
}
