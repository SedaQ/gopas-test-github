package com.gopas.cz.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String email;
    private String position;
    private LocalDate birthday;

    Person() {
    }

    public Person(String name, String email, String position, LocalDate birthday) {
        super();
        this.name = name;
        this.email = email;
        this.position = position;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email + ", position=" + position + ", birthday=" + birthday + "]";
    }
    
}
