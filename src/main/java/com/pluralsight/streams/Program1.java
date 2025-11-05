package com.pluralsight.streams;

import StreamsPart2.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Liam", "Walker", 25));
        people.add(new Person("Emma", "Johnson", 32));
        people.add(new Person("Noah", "Brown", 28));
        people.add(new Person("Olivia", "Davis", 22));
        people.add(new Person("Ava", "Miller", 45));
        people.add(new Person("Sophia", "Wilson", 19));
        people.add(new Person("James", "Moore", 33));
        people.add(new Person("Isabella", "Taylor", 27));
        people.add(new Person("Elijah", "Anderson", 38));
        people.add(new Person("Charlotte", "Thomas", 29));


        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();


        List<Person> matchedPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getfirstName().toLowerCase().contains(searchName) ||
                    person.getlastName().toLowerCase().contains(searchName)) {
                matchedPeople.add(person);
            }
        }


        if (matchedPeople.isEmpty()) {
            System.out.println("No matches found for \"" + searchName + "\".");
        } else {
            System.out.println("\nPeople who matched your search:");
            for (Person p : matchedPeople) {
                System.out.println(p);
            }
        }


        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("\n--- Statistics ---");
        System.out.printf("Average age: %.2f%n", averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

        scanner.close();
    }
}


