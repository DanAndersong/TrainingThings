package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object p : pets) System.out.println(p);
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
