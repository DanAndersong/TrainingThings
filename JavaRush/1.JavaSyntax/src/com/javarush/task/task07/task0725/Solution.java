package com.javarush.task.task07.task0725;

/* 
Переставь один модификатор static
*/

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int i = sol.getValue();
//        System.out.println(i + 10);
    }

    public int getValue() {
        return C;
    }
}
