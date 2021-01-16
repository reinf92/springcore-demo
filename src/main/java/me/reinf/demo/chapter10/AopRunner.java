package me.reinf.demo.chapter10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
//@ImportResource("classpath:section11/applicationContext.xml")
public class AopRunner implements ApplicationRunner {

    @Autowired
    EventService eventService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        eventService.createEvent();
        eventService.updateEvent();
        eventService.deleteEvent();
    }
}
