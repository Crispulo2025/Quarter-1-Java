class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ReferenceDemo {
    public static void main(String[] args) {
        // create a Person object
        Person person1 = new Person("Cris");

        // another reference pointing to the same object
        Person person2 = person1;

        System.out.println("Before change:");
        System.out.println("person1 name: " + person1.name);
        System.out.println("person2 name: " + person2.name);

        // change the name using person2
        person2.name = "Anna";

        System.out.println("\nAfter change:");
        System.out.println("person1 name: " + person1.name);
        System.out.println("person2 name: " + person2.name);
    }
}
