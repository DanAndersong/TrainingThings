package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        new Outer.Nested();
        Outer.Inner i = new Outer().new Inner();
    }
}
