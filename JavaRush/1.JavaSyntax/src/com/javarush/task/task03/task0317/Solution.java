package com.javarush.task.task03.task0317;
/* 
Путь самурая
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст: ");
        String sAge = reader.readLine();
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + nAge);
    }
}
