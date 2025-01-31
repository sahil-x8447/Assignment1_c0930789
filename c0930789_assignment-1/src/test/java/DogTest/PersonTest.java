package DogTest;

import org.junit.jupiter.api.Test;
import Dog.Dog;
import Dog.Person;


import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // Test that the dog's name is changed when the person has a dog
    @Test
    void testChangeDogsName_WhenPersonHasDog_ShouldChangeName() {
        Dog dog = new Dog("Guffy", 5);
        Person sahil = new Person("Sahil", 23, dog);
        sahil.changeDogsName("Hope");  // Change the dog's name to "Hope"
        assertEquals("Hope", dog.getName());  // Verify if the dog's name was updated correctly
    }

    // Test that an exception is thrown when trying to change the dog's name when the person has no dog
    @Test
    void testChangeDogsName_WhenPersonHasNoDog_ShouldThrowException() {
        Person sahil = new Person("Sahil", 23);
        Exception exception = assertThrows(RuntimeException.class, () -> sahil.changeDogsName("Guffy"));
        assertEquals("Sahil does not own a dog!", exception.getMessage());  // Verify the exception message
    }

    // Test that the hasOldDog method returns true when the dog is 10 years or older
    @Test
    void testHasOldDog_WhenDogIsOld_ShouldReturnTrue() {
        Dog dog = new Dog("Guffy", 12);
        Person sahil = new Person("Sahil", 23, dog);
        assertTrue(sahil.hasOldDog());  // Verify that hasOldDog returns true for an old dog
    }

    // Test that the hasOldDog method returns false when the dog is younger than 10 years
    @Test
    void testHasOldDog_WhenDogIsYoung_ShouldReturnFalse() {
        Dog dog = new Dog("Guffy", 5);
        Person sahil = new Person("Sahil", 23, dog);
        assertFalse(sahil.hasOldDog());  // Verify that hasOldDog returns false for a young dog
    }

    // Test that the hasOldDog method returns false when the person has no dog
    @Test
    void testHasOldDog_WhenPersonHasNoDog_ShouldReturnFalse() {
        Person sahil = new Person("Sahil", 23);
        assertFalse(sahil.hasOldDog());  // Verify that hasOldDog returns false when there is no dog
    }
}
