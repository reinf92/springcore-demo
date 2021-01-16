package me.reinf.demo.chapter6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class ResourceRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader rLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /*
        * AnnotationConfigServletWebServerApplicationContext(WebApplicationContext 구현)
        * */
//        System.out.println(rLoader.getClass());

        /*
        * rLoader가 WebApplicationContext이기에 ServletContextResource를 반환해야 하지만,
        * 접두어를 이용하여 ClassPathResource를 반환
        * */
        Resource r =  rLoader.getResource("classpath:DummyText.txt");
//        System.out.println(r.getClass());
//
//        System.out.println(r.exists());
//        System.out.println(r.getDescription());
//        System.out.println(r.getURI().getPath());
    }
}
