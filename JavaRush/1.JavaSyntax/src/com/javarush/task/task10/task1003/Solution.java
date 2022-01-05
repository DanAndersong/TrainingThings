package com.javarush.task.task10.task1003;

/* 
Задача №3 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.5;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);//need 0
    }
}
