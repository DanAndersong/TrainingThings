package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(Integer.parseInt(reader.readLine()));
        int listSize = list.size();
        int max = 0;
        int current = 1;
        for (int i = 0; i < listSize-1; i++) {
            if (list.get(i).equals(list.get(i + 1))) current++;
            else {
                if (current > max) {
                    max = current;
                    current = 1;
                }
                else current = 1;
            }
        }
        if (current > max) max = current;

        System.out.println(max);
    }
}