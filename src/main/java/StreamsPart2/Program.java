package StreamsPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
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


        System.out.print("Enter first or last name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();


        List<Person> matchedPeople = people.stream()
                .filter(p -> p.getfirstName().toLowerCase().contains(searchName)
                        || p.getlastName().toLowerCase().contains(searchName))
                .collect(Collectors.toList());



        // Step 4: Display results
        if (matchedPeople.isEmpty()) {
            System.out.println("No matches found for \"" + searchName + "\".");
        } else {
            System.out.println("\nPeople who matched your search:");
           matchedPeople.forEach(System.out::println);
            }


        double averageAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum) / (double) people.size();

        // Step 4: Find oldest and youngest using Stream
        int oldest = people.stream()
                .map(Person::getAge)
                .max(Integer::compare)
                .orElse(0);

        int youngest = people.stream()
                .map(Person::getAge)
                .min(Integer::compare)
                .orElse(0);

        System.out.println("\n--- Statistics (Stream version) ---");
        System.out.printf("Average age: %.2f%n", averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

        scanner.close();
    }
}














