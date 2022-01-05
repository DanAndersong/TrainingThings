package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        int[] nums = new int[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < 10 ; i++) {
            nums[i] = strings[i].length();
            System.out.println(nums[i]);
        }
    }
}
