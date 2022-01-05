package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true){
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
            if (s == -1)
                break;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        System.out.println(sum);
    }
}
