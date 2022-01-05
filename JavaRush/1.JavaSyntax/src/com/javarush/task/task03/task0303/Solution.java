package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100, 1.1334));
        System.out.println(convertEurToUsd(600, 1.1334));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double resultUsd = eur * course;
        return resultUsd;


    }
}
