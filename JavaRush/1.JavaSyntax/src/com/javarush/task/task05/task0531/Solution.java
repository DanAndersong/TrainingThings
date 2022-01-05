package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Совершенствуем функциональность
*/

public class Solution {

//      МОЕ ВТОРОЕ РЕШЕНИЕ, ОНО НЕ СООТВЕТСТВУЕТ УСЛОВИЯМ, НО БОЛЕЕ ПРАВИЛЬНОЕ
//
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    ArrayList<Integer> min = new ArrayList<Integer>();
//
//        for (int i = 0; i < 5; i++) {
//        min.add(Integer.parseInt(reader.readLine()));
//        }
//        Collections.sort(min);
//        System.out.println("Minimum = " + min.get(0));

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int result = min(a,b,c,d,e);

        System.out.println("Minimum = " + result);
    }


    public static int min(int a, int b, int c, int d, int e) {
        ArrayList<Integer> min = new ArrayList<Integer>();
        min.add(a);
        min.add(b);
        min.add(c);
        min.add(d);
        min.add(e);
        Collections.sort(min);
        return min.get(0);
    }
}
