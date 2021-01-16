package me.reinf.demo.chapter10;

import org.springframework.stereotype.Service;

@Service
public class MyEventService implements EventService {

    @Override
    public void createEvent() {
        System.out.println("createEvent!!");
    }

    @Override
    public void updateEvent() {
        System.out.println("updateEvent!!");
    }

    @Override
    public void deleteEvent() {
        System.out.println("deleteEvent!!");
    }
}
