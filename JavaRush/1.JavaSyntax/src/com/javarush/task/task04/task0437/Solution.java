package com.javarush.task.task04.task0437;

public class Solution {
    public static void main(String[] args) {
        int a = 1;

        for(int j = 1; j <= 10; j++) {

            for (int i = 1; i <= a; i++)
                System.out.print(8);

            System.out.print("\n");
            a++;
        }
    }
}

