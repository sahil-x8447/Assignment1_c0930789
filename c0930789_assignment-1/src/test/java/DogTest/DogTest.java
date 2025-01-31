package DogTest;

import org.junit.jupiter.api.Test;
import Dog.Dog;
//import Dog.Person;


import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    // Test that the Dog constructor correctly initializes the name and age of the dog
    @Test
    void testDogConstructor_ShouldInitializeCorrectly() {
        Dog dog = new Dog("Guffy", 5);
        assertEquals("Guffy", dog.getName());  // Check if the name is initialized correctly
        assertEquals(5, dog.getAge());  // Check if the age is initialized correctly
    }

    // Test that the dog's name is updated correctly using the setName method
    @Test
    void testSetName_ShouldUpdateDogName() {
        Dog dog = new Dog("Guffy", 5);
        dog.setName("Max");  // Change the dog's name to "Max"
        assertEquals("Max", dog.getName());  // Verify if the name was updated correctly
    }

    // Test that the dog's age is updated correctly using the setAge method
    @Test
    void testSetAge_ShouldUpdateDogAge() {
        Dog dog = new Dog("Guffy", 5);
        dog.setAge(10);  // Change the dog's age to 10
        assertEquals(10, dog.getAge());  // Verify if the age was updated correctly
    }

    // Test that the equals method returns true for two dogs with the same name and age
    @Test
    void testEqualsMethod_ShouldReturnTrueForSameDogs() {
        Dog dog1 = new Dog("Guffy", 5);
        Dog dog2 = new Dog("Guffy", 5);
        assertEquals(dog1, dog2);  // Verify if the two dogs are considered equal
    }

    // Test that the equals method returns false for two dogs with different names or ages
    @Test
    void testEqualsMethod_ShouldReturnFalseForDifferentDogs() {
        Dog dog1 = new Dog("Guffy", 5);
        Dog dog2 = new Dog("Hope", 6);
        assertNotEquals(dog1, dog2);  // Verify if the two dogs are considered not equal
    }
}
