package com.javarush.task.task08.task0819;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
//        1 вариант
//        Iterator<Cat> iterator = cats.iterator();
//        iterator.next();
//        iterator.remove();

//        2 вариант
        for (Object s : cats) {
            cats.remove(s);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        set.add(cat);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Object s = iterator.next();
            System.out.println(s);
        }

    }

    public static class Cat {

    }
}
