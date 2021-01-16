package me.reinf.demo.chapter1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BookRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        BookService bookService = (BookService) context.getBean("bookService");
        BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");

//        System.out.println(Arrays.toString(beanDefinitionNames));
//        System.out.println(bookService);
//        System.out.println(bookService.bookRepository);
//        System.out.println(bookRepository);
    }
}
