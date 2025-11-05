package com.pluralsight.streams;

public class Person1 {
    private String firstName;
    private String lastName;
    int age;

    public Person1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public  String getFirstName() {
        return firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
}
