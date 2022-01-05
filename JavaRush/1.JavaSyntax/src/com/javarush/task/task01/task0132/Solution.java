package com.javarush.task.task01.task0132;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
        System.out.println();
    }

    public static int sumDigitsInNumber(int number) {
        int[] small = new int[10];
        int result = 0;
        for (int i = 0; i < small.length; i++) {

            small[i] = number % 10;
            number /= 10;
            result += small[i];
        }

        return result;
    }
}