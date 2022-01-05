package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) list.add(reader.readLine());
        int spells = list.get(0).length();

        for (int k = 1; k < list.size(); k++) {
            if (list.get(k).length() < spells) { System.out.println(k); break; }
            else spells = list.get(k).length();
        }

    }
}

