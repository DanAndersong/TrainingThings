package com.javarush.task.task22.task2210;

import java.lang.reflect.Array;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] tokens = getTokens("level22.lesson13.task01", ".");
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] tokens = new String[stringTokenizer.countTokens()];

        for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {
            tokens[i] = stringTokenizer.nextToken();
        }
        return tokens;
    }
}
