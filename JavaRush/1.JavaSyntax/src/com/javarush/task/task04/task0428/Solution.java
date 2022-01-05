package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int a1 = 0;
        if (a > 0) a1++;
        if (b > 0) a1++;
        if (c > 0) a1++;
        System.out.println(a1);
    }
}
