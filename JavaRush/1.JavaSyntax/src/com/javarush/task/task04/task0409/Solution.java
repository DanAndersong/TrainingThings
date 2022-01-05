package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, -14);
        displayClosestToTen(-7, 2);
        displayClosestToTen(-7, -14);
    }

    public static void displayClosestToTen(int a, int b) {
        int a1 = abs(a - 10);
        int a2 = abs(b - 10);
        System.out.println((a1 == a2) ? a : (a1 < a2) ? a : b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}