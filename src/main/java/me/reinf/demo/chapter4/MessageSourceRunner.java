package me.reinf.demo.chapter4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(messageSource.getMessage("greeting", new String[]{"reinf"}, Locale.US));
//        System.out.println(messageSource.getMessage("greeting", new String[]{"reinf"}, Locale.KOREA));
//        System.out.println(messageSource.getClass().toString());
    }
}
