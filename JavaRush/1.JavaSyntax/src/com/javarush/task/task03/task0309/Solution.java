package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int t = 1;
        for(int i = 2; i <= 6; i++) {
            System.out.println(t);
            t = t + i;
        }
    }
}
