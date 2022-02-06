package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for (Character c: string.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        for (Character c: string.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (Character c: string.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
}
