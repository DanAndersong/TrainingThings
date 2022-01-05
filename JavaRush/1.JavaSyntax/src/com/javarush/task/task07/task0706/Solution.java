package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numsTower = new int[15];
        int summPeopleLeft = 0;
        int summPeopleRight = 0;

        for (int i = 0; i < numsTower.length; i++) {
            numsTower[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                summPeopleLeft += numsTower[i];
            else
                summPeopleRight += numsTower[i];
        }

        if (summPeopleLeft > summPeopleRight)
             System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
