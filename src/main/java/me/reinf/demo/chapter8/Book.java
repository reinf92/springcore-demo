package me.reinf.demo.chapter8;

public class Book {

    private Integer id;
    private String title;

    public Book(int id) {
        this.id = id;
    }

    //getter, setter 생략..
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
