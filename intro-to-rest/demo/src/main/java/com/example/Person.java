package com.example;
public class Person {
    private String name;
    private String about;
    private int birthYear;

    public Person(String name, String about, int birthYear) {
        this.name = name;
        this.about = about;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAbout() {
        return this.about;
    }

    public int getBirthYear() {
        return this.birthYear;
    }
}
