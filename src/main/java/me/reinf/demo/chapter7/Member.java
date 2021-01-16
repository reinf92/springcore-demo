package me.reinf.demo.chapter7;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Member {
    @NotEmpty
    private String id;
    @NotEmpty
    private String password;

    private String name;
    @Email(message = "이메일 형식이 아닙니다.")
    private String email;

    //getter, setter 생략..

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
