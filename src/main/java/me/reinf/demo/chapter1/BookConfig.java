package me.reinf.demo.chapter1;

import me.reinf.demo.SpringcoreDemoApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "me.reinf.demo")
//@ComponentScan(basePackageClasses = SpringcoreDemoApplication.class)
public class BookConfig {

    @Bean
    public BookService bookService(){
        return new BookService(bookRepository());
    }

    @Bean
    public BookRepository bookRepository(){
        return new BookRepository();
    }
}
