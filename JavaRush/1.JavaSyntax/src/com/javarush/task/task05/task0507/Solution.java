package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> nums = new ArrayList<Double>();
        double d, total = 0;
        while (true) {
            d = Integer.parseInt(reader.readLine());
            nums.add(d);
            if (d == -1) {
                break;
            }
        }
        nums.remove(nums.size()-1);
        for (int i = 0; i < nums.size() ; i++) {
            total += nums.get(i);
        }
        System.out.println(total/nums.size());
    }
}

