package app;

import org.springframework.context.annotation.*;
import app.model.Book;
import app.service.GenericRepository;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                SpringDiApplication.class);

        GenericRepository<String, Book> repo = ctx.getBean(GenericRepository.class);
        repo.add(new Book("1234567890123", "Pierwsza", "Pierwszy autor"));
        repo.add(new Book("2345678901234", "Druga", "Drugi autor"));
        repo.add(new Book("3456789012345", "Trzecia", "Trzeci autor"));
        Book book = repo.get("1234567890123");
        System.out.println(book);

        ctx.close();
    }
}