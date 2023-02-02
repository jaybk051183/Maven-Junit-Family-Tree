package org.example;

import java.util.ArrayList;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings;
    private ArrayList<Person> children;
    private ArrayList<Pet> pets;

    // Constructors

    public Person() {
    }

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

    public Person(Person parent) {
    }

    public Person(Person grandmother, Person grandfather) {
    }

    public Person(String male) {
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    // Methode addParents
    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
        mother.addChild(this);
        father.addChild(this);
    }

    // Methode addChild
    public void addChild(Person child) {
        this.children.add(child);
        child.getSiblings().addAll(this.children);
    }

    // Methode addPet
    public void addPet(Pet pet) {
        this.pets.add(pet);
        pet.setOwner(this);
    }

    // Methode addSibling
    public void addSibling(Person sibling) {
        this.siblings.add(sibling);
        sibling.getSiblings().add(this);
    }

    // Methode getGrandChildren
    public ArrayList<Person> getGrandChildren() {
        ArrayList<Person> grandChildren = new ArrayList<>();
        for (Person child : this.children) {
            grandChildren.addAll(child.getChildren());
        }
        return grandChildren;
    }
}

