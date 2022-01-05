package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3]; //изменить, если чисел нужно будет вводить >3
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
            if (nums[i] > 0) positive++;
            else if (nums[i] < 0) negative++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());//добавить, если чисел нужно будет вводить >3
//        int negative = 0;
//        int positive = 0;
//
//             if (a > 0) positive++;
//        else if (a < 0) negative++;
//             if (b > 0) positive++;
//        else if (b < 0) negative++;
//             if (c > 0) positive++;
//        else if (c < 0) negative++;//добавить, если чисел нужно будет вводить >3
//
//        System.out.println("количество отрицательных чисел: " + negative);
//        System.out.println("количество положительных чисел: " + positive);
    }
}
