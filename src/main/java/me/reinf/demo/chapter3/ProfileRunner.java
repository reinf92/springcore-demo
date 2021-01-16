package me.reinf.demo.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProfileRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Autowired
    DatabaseConfig databaseConfig;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment env = context.getEnvironment();

//        System.out.println(Arrays.toString(env.getActiveProfiles()));
//        System.out.println(Arrays.toString(env.getDefaultProfiles()));
//
//        databaseConfig.getConfigInformation();
    }
}
