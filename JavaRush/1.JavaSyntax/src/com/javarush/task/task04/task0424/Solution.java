package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());

        if (b == c && a != b)
            System.out.println(1);
        else if (a == c && b != a)
            System.out.println(2);
        else if (a == b && c != b)
            System.out.println(3);
    }
}