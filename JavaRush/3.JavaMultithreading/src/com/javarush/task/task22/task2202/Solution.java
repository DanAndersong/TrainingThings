package com.javarush.task.task22.task2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис"));
    }

    public static String getPartOfString(String string) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String[] split = string.split(" ");

            for (int i = 1; i < 5; i++) {
                stringBuilder.append(split[i] + " ");
            }
            return stringBuilder.toString().trim();
        }catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
