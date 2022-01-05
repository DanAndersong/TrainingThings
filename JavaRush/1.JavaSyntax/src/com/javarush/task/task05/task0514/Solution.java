package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
    Person person = new Person();
    person.initialize("Nobody", 100);
    }

    static class Person {
        private int age;
        private String name;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
