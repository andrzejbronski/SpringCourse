package app.service.aspects;
import  app.model.Book;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before("app.service.aspects.AspectUtil.allBookRepositoryMethods()")
    public void logInfoBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.printf("Log before %s with atgs: %s\n",
                joinPoint.getSignature(),
                Arrays.toString(args));
    }

    @After("app.service.aspects.AspectUtil.allBookRepositoryMethods()")
    public void logInfoAfter() {
        System.out.println("Method executed ");
    }

    @AfterThrowing(pointcut = "app.service.aspects.AspectUtil.allBookRepositoryMethods()", throwing = "error")
    public void logError(JoinPoint joinPoint, Throwable error) {
        System.out.printf("Method %s finished with error %s ", joinPoint.getSignature(), error.getMessage());
    }

    @AfterReturning(pointcut = "execution(* app.service.BookRepository.get(..)) && args(isbn)",
            returning = "result")
    public void logSuccess(JoinPoint joinPoint, String isbn, Book result) {
        if (result != null)
        System.out.printf("Method get() successfully returned value for isbn %s\n",result, isbn);
    }
}
