package me.reinf.demo.chapter8;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

//    @InitBinder
//    public void init(WebDataBinder webDataBinder){
//        webDataBinder.registerCustomEditor(Book.class, new BookEditor());
//    }

    @GetMapping("/book/{book}")
    public String getBook(@PathVariable Book book){
        System.out.println("book = " + book);
        return book.getId().toString();
    }
}