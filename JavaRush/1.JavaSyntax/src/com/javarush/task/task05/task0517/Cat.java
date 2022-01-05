package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private String color;
    private String address;
    private int age;
    private int weight;

    public Cat(String name){
        this.name = name;
        this.color = "unknown";
        this.address = null;
        this.age = 1;
        this.weight = 4;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.color = "unknown";
        this.address = null;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age){
        this.name = name;
        this.color = "unknown";
        this.address = null;
        this.age = age;
        this.weight = 4;
    }
    public Cat(int weight, String color){
        this.name = null;
        this.color = color;
        this.address = null;
        this.age = 4;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address){
        this.name = null;
        this.color = color;
        this.address = address;
        this.age = 4;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
