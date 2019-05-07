package com.example.mymidterm;

import java.io.Serializable;

public class GuestBookData implements Serializable {

    private String email;
    private String phone;
    private String name;
    private String comments;

    public GuestBookData(String email, String phone, String name, String comments) {
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.comments = comments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
