package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double result = i + (i/100.00) * 10.00;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
