package me.reinf.demo.chapter3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PropertiesValueAnnotationRunner implements ApplicationRunner {

    @Value("${spring.datasource.driver-class-name}")
    String driverClassName;

    @Value("${spring.datasource.url}")
    String url;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        System.out.println(driverClassName);
//        System.out.println(url);
//        System.out.println(username);
//        System.out.println(password);
    }
}
