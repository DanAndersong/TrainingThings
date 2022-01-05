package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        if (a >= b && a >= c) {
            if (b >= c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        }
        else if (b >= a && b >= c) {
            if (c >= a)
                System.out.println(b + " " + c + " " + a);
            else
                System.out.println(b + " " + a + " " + c);
        }
        else if (c >= a && c >= b) {
            if (b >= a)
                System.out.println(c + " " + b + " " + a);
            else
                System.out.println(c + " " + a + " " + b);
        }

    }
}
