package com.javarush.task.task12.task1224;

/* 
Неведома зверушка "Кот", "Тигр", "Лев", "Бык", "Животное".
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {

       switch (o.getClass().getSimpleName()){
           case "Lion":  return "Лев";
           case "Bull":  return "Бык";
           case "Cat":   return "Кот";
           case "Tiger": return "Тигр";
       }

       return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
