package me.reinf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoreDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringcoreDemoApplication.class, args);
        SpringApplication app = new SpringApplication(SpringcoreDemoApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
