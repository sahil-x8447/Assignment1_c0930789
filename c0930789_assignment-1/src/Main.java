public class Main {
    public static void main(String[] args) {
        // Create a Person object with no dog
        Person sahil = new Person("Sahil", 23);

        try {
            // Attempt to change the name of Sahil's dog, which doesn't exist yet
            sahil.changeDogsName("Guffy");
        } catch (RuntimeException e) {
            // Catch and display the exception if dog name change fails (because Sahil has no dog)
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }

        // Create a Dog object named "Guffy"
        Dog guffy = new Dog("Guffy", 5);

        // Create a Person object with a dog (Guffy)
        Person sahilWithDog = new Person("Sahil", 23, guffy);

        // Change the dog's name to "Hope"
        sahilWithDog.changeDogsName("Hope");

        // Display the new dog's name
        System.out.println("Dog's new name: " + sahilWithDog.getDog().get().getName());
    }
}
