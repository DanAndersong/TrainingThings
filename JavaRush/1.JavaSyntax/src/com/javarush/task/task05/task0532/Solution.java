package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int i = Integer.parseInt(reader.readLine());

        for(int j = 1; j <= i; j++){
            nums.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(nums);
        Collections.reverse(nums);
        int maximum = nums.get(0) ;

        System.out.println(maximum);
    }
}
