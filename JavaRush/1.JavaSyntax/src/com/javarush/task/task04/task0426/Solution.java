package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        boolean even = (i % 2) == 0;
        if (i == 0)
            System.out.println("ноль");
        else if (i < 0 && !even)
            System.out.println("отрицательное нечетное число");
        else if (i < 0 && even)
            System.out.println("отрицательное четное число");
        else if (i > 0 && even)
            System.out.println("положительное четное число");
        else if (i > 0 && !even)
            System.out.println("положительное нечетное число");


    }
}
