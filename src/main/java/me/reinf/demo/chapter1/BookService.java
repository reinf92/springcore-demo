package me.reinf.demo.chapter1;

import org.springframework.stereotype.Component;


public class BookService {

    public BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
