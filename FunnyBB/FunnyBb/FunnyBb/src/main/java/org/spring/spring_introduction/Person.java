package org.spring.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.print("hello my pet ");
        pet.say();
    }
}
