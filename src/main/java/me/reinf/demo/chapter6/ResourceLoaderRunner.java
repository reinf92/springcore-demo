package me.reinf.demo.chapter6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class ResourceLoaderRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader rLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource r =  rLoader.getResource("classpath:DummyText.txt");

//        System.out.println(r.exists());
//        System.out.println(r.getFilename());
//        System.out.println(r.getURI().getPath());
//
//        Path path = Paths.get(r.getURI());
//        List<String> content = Files.readAllLines(path);
//
//        for (String line : content) {
//            System.out.println(line);
//        }
    }
}
