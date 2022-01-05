package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            list.add(i + "String");

        System.out.println(list.size());

        for (String i: list)
            System.out.println(i);
    }


}
