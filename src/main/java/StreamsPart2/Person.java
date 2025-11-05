package StreamsPart2;

public class Person {
    static String firstName;
    static String lastName;
    int age;

    public Person(String firstname, String lastname, int age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public static String getfirstName() {
        return firstName;
    }

    public static String getlastName() {
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
