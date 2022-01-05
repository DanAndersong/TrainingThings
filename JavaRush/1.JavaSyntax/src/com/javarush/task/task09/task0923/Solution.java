package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
//        String s = "Мама мыла раму.";
        s = s.replaceAll("\\s+",""); //удаление пробелов
        String strV = "";
        String strC = "";

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) strV = strV.concat(s.charAt(i) + " ");

            if (!isVowel(s.charAt(i))) strC = strC.concat(s.charAt(i) + " ");
        }

        System.out.println(strV);
        System.out.println(strC);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}