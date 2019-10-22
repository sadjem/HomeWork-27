package com.lepet.model;

public class User {
    private String name;
    private int age;
    private String street;
    private int houseNumber;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, String street, int houseNumber) {
        this.name = name;
        this.age = age;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
