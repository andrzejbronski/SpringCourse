public class Main {
    public static void main(String[]args){
        MessageProducer fileMessageProducer = new FileMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(fileMessageProducer);
        messagePrinter.printMessage();

        MessageProducer simpleMessageProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter1 = new MessagePrinter(simpleMessageProducer);
        messagePrinter1.printMessage();
    }

}
