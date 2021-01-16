package me.reinf.demo.chapter8;

import java.beans.PropertyEditorSupport;

public class BookEditor extends PropertyEditorSupport { //PropertyEditor 인터페이스의 구현 클래스

    //특정 타입을 문자열로 변환하여 리턴
    @Override
    public String getAsText() {
        Book book = (Book) getValue();
        return book.getId().toString();
    }

    //입력값인 문자열을 특정 타입으로 변환
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Book(Integer.parseInt(text)));
    }
}
