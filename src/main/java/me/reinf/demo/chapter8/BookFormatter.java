package me.reinf.demo.chapter8;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class BookFormatter implements Formatter<Book> {

    @Override
    public Book parse(String text, Locale locale) throws ParseException {
        return new Book(Integer.parseInt(text));
    }

    @Override
    public String print(Book object, Locale locale) {
        return object.getId().toString();
    }
}
