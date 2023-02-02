package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void setOwner() {
        Person owner = new Person("Rosie", "Smith", 25, "female");
        Pet pet = new Pet("Max", 3, "dog", owner);
        assertEquals("Rosie", pet.getOwner().getName());

    }
}