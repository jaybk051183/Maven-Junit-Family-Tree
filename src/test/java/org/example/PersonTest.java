package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
   public  void addParents() {
        Person mother = new Person("Rosie", "Smith", 25, "female");
        Person father = new Person("Jay", "Smith", 30, "male");
        Person child = new Person();
        assertEquals("Rosie", child.getMother().getName());
        assertEquals("Jay", child.getFather().getName());
    }

    @Test
    void addChild() {
        Person parent = new Person("Rosie", "Smith", 25, "female");
        Person child1 = new Person(parent);
        Person child2 = new Person(parent);
        assertEquals(2, parent.getChildren().size());
        assertEquals(2, child1.getSiblings().size());
        assertEquals(2, child2.getSiblings().size());
    }

    @Test
    void addPet() {
        Person owner = new Person("Rosie", "Smith", 25, "female");
        Pet pet = new Pet("Max", 3, "dog", owner);
        owner.addPet(pet);
        assertEquals("Rosie", pet.getOwner().getName());
        assertEquals(1, owner.getPets().size());
    }

    @Test
    void addSibling() {
        Person sibling1 = new Person("Rosie", "Smith", 25, "female");
        Person sibling2 = new Person("Jay", "Smith", 28, "male");
        sibling1.addSibling(sibling2);
        assertEquals(1, sibling1.getSiblings().size());
        assertEquals(1, sibling2.getSiblings().size());
    }

    @Test
    public void testGetGrandChildren() {
        Person grandmother = new Person("Anne", "Brown", 55, "female");
        Person grandfather = new Person("John", "Brown", 60, "male");
        Person parent = new Person(grandmother, grandfather);
        Person child = new Person("male");
        assertEquals(1, parent.getChildren().size());
        assertEquals(1, grandmother.getGrandChildren().size());
        assertEquals(1, grandfather.getGrandChildren().size());
    }

}