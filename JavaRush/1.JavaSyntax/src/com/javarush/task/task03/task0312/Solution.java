package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }

    public static int convertToSeconds(int hour){
        int result = hour * 60 * 60;
        return result;
    }
}
