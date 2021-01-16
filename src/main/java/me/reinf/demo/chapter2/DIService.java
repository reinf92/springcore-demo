package me.reinf.demo.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DIService {

    @Autowired
    private DIRepository diRepository; //필드주입

    @Autowired
    public DIRepository getDiRepository() { //생성자주입
        return diRepository;
    }

    @Autowired
    public void setDiRepository(DIRepository diRepository) { //수정자주입
        this.diRepository = diRepository;
    }
}