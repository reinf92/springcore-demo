package me.reinf.demo.chapter2;

import org.springframework.stereotype.Repository;

@Repository
public class DIRepository {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
