package me.reinf.demo.chapter8;

import org.springframework.core.convert.converter.Converter;

public class BookConverter {

    public static class StringToBookConvertor implements Converter<String, Book>{

        @Override
        public Book convert(String source) {
            return new Book(Integer.parseInt(source));
        }
    }

    public static class BookToStringConvertor implements Converter<Book, String>{

        @Override
        public String convert(Book source) {
            return source.getId().toString();
        }
    }
}
