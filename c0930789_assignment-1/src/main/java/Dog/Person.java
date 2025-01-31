package Dog;

import java.util.Optional;

public class Person {
    private String name; // Person's name
    private int age; // Person's age
    private Optional<Dog> dog; // Optional reference to a Dog object (can be null)

    // Constructor to initialize the person's name, age, and optional dog
    public Person(String name, int age) {
        this(name, age, null); // Default to no dog
    }

    // Constructor to initialize the person's name, age, and a dog
    public Person(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog); // Use Optional to handle null dog cases
    }

    // Check if the person has an old dog (age >= 10)
    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false); // Return true if dog exists and is older than or equal to 10
    }

    // Change the dog's name if the person owns a dog
    public void changeDogsName(String newName) {
        dog.map(d -> {
            d.setName(newName); // Change the dog's name
            return d;
        }).orElseThrow(() -> new RuntimeException(name + " does not own a dog!")); // Throw an exception if no dog exists
    }

    // Getter for the person's name
    public String getName() {
        return name;
    }

    // Getter for the person's age
    public int getAge() {
        return age;
    }

    // Getter for the person's optional dog
    public Optional<Dog> getDog() {
        return dog;
    }
}
