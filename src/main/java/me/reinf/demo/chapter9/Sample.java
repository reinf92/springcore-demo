package me.reinf.demo.chapter9;

import org.springframework.stereotype.Component;

@Component
public class Sample {

    int id = 5000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
