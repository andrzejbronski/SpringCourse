package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.dao.BookDao;
import app.model.Book;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaApplication.class, args);
        BookDao dao = ctx.getBean(BookDao.class);
        Book book = new Book("1234567890468", "Spring is so cool", "Javastart");
        dao.save(book);
        Thread.sleep(5000);
    }
}
