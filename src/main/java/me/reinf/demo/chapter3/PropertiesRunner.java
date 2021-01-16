package me.reinf.demo.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PropertiesRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment env = context.getEnvironment();

//        System.out.println(env.getProperty("spring.datasource.driver-class-name"));
//        System.out.println(env.getProperty("spring.datasource.url"));
//        System.out.println(env.getProperty("spring.datasource.username"));
//        System.out.println(env.getProperty("spring.datasource.password"));
    }
}
