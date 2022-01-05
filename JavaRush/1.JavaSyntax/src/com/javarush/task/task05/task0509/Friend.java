package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    private int age;
    private String name;
    private char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
