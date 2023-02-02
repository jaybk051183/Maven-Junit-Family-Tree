package org.example;

public class Pet {
    private String name;
    private int age;
    private String species;
    private Person owner;

    // Constructor met alle attributen op 'owner' na
    public Pet(String name, int age, String species, Person owner) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
