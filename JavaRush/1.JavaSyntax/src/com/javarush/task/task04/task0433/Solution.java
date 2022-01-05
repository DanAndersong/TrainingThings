package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        for (int j = 1; j <= 10 ; j++) {
            int i = 1;
            while (i <= 10) {
                System.out.print("S");
                i++;
            }
            System.out.println();
        }
        int j = 1;
        while (j <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print("S");
                i++;
            }
            System.out.println();
            j++;
        }
    }
}
