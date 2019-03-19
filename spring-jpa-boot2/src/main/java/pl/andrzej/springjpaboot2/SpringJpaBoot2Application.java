package pl.andrzej.springjpaboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.andrzej.springjpaboot2.dao.BookDao;
import pl.andrzej.springjpaboot2.model.Book;

@SpringBootApplication
public class SpringJpaBoot2Application {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaBoot2Application.class, args);
        BookDao dao = ctx.getBean(BookDao.class);
        Book book = new Book("1234567890468", "Spring is so good!", "Andrzej B");
        dao.save(book);
        Thread.sleep(5000);
    }
}
