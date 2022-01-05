package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("фкмф");
        strings.add("пфкпфы");
        strings.add("пфпкия");
        strings.add("раыфалл");
        strings.add("раыфа");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            int r = 0;
            int l = 0;

            for (String s : strings.get(i).split("")){
                if (s.equals("р")) r++;
                if (s.equals("л")) l++;
            }

            if (l == 0 && r == 0)
                list.add(strings.get(i));

            if (l > 0) {
                if (r > 0)
                    list.add(strings.get(i));
                else {
                    list.add(strings.get(i));
                    list.add(strings.get(i));
                }
            }
        }

        return list;
    }
}