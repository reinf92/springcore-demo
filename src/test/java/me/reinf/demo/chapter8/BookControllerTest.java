package me.reinf.demo.chapter8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({BookFormatter.class, BookController.class})
public class BookControllerTest {
    
    @Autowired
    MockMvc mockMvc;
    
    @Test
    public void getTest() throws Exception {
        mockMvc.perform(get("/book/100"))
                .andExpect(status().isOk())
                .andExpect(content().string("100"));
    }
}