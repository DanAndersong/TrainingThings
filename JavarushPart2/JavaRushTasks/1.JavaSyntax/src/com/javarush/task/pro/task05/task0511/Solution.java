package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        multiArray = new int[s.nextInt()][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[s.nextInt()];
        }

       // System.out.println(Arrays.deepToString(multiArray));
    }
}
