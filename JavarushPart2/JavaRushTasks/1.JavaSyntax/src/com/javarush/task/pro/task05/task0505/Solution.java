package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] nums = new int[s.nextInt()];

        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = s.nextInt();
            }
        }

        if (nums.length % 2 == 0) {
            for (int i = nums.length-1; i >= 0; i--) {
                System.out.println(nums[i]);
            }
        } else {
            for (int i: nums) {
                System.out.println(i);
            }
        }
    }
}
