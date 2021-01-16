package me.reinf.demo.chapter2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Component
public class DIRunner implements ApplicationRunner {

    @Autowired
    DIService diService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(diService);
//        System.out.println(diService.getDiRepository().getValue());
    }
}
