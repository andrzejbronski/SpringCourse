package app;

import java.util.List;
import org.springframework.context.annotation.*;
import app.beans.NameRepository;

@Configuration
@ComponentScan
public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                SpringDiApplication.class);

        NameRepository namesRepo= ctx.getBean(NameRepository.class);
        List<String> allNames = namesRepo.getAll();
        allNames.forEach(System.out::println);

        ctx.close();
    }
}