package com.javarush.task.task04.task0414;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);

        if (i % 400 == 0)
            System.out.println("количество дней в году: 366");

        else if (i % 100 == 0)
            System.out.println("количество дней в году: 365");

        else if (i % 4 == 0)
            System.out.println("количество дней в году: 366");

        else
            System.out.println("количество дней в году: 365");

    }

}