package com.pluralsight.streams;

public class Person {
    static String FirstName;
    static String lastName;
    int age;

    public Person(String firstname, String lastname, int age) {
        this.FirstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public static String getFirstname() {
        return FirstName;
    }

    public static String getLastname() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return FirstName + " " + lastName + " (Age: " + age + ")";
    }
}
