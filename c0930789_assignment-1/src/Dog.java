import java.util.Objects;

public class Dog {
    private String name; // Name of the dog
    private int age; // Age of the dog

    // Constructor to initialize the dog's name and age
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for the dog's name
    public String getName() {
        return name;
    }

    // Setter for the dog's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the dog's age
    public int getAge() {
        return age;
    }

    // Setter for the dog's age
    public void setAge(int age) {
        this.age = age;
    }

    // Override equals method to compare dogs based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // If the same object, return true
        if (o == null || getClass() != o.getClass()) return false; // Check if the other object is of the same class
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name); // Check if the dog's name and age are the same
    }

    // Override hashCode method to generate hash code based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Generate hash code using the dog's name and age
    }
}
