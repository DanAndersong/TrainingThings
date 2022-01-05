package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private Boolean sex;
        private int age;
        private int weight;
        private Human child;
        private Human parent;

        public Human () {

        }

        public Human (String name) {
            this.name = name;
        }

        public Human (String name, Boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human (String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human (String name, Boolean sex, int age, int weight) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human (String name, Human parent, Human child) {
            this.name = name;
            this.parent = parent;
            this.child = child;
        }

        public Human (Boolean sex, int weight) {
            this.sex = sex;
            this.weight = weight;
        }

        public Human (String name, Human child) {
            this.name = name;
            this.child = child;
        }

        public Human (String name, Boolean sex, int age, Human parent) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.parent = parent;
        }


    }
}
