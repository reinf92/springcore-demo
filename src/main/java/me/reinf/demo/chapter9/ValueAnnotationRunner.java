package me.reinf.demo.chapter9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    int intValue;

    @Value("#{1 eq 1}")
    boolean booleanValue;

    @Value("#{'string'}")
    String stringValue;

    @Value("${spring.properties.value}")
    int springPropertiesValue;

    @Value("#{${spring.properties.value} eq 100}")
    boolean isSpringPropertiesValue100;

    @Value("#{sample.id}")
    int sampleId;

    @Value("#{'string'.concat('!!!')}")
    String method;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        System.out.println(intValue);
//        System.out.println(booleanValue);
//        System.out.println(stringValue);
//        System.out.println(springPropertiesValue);
//        System.out.println(isSpringPropertiesValue100);
//        System.out.println(sampleId);
//        System.out.println(method);
    }
}
