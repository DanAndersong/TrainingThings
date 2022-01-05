package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        boolean even = (i % 2) == 0;
        boolean range = i > 0 && i < 1000;
        if (range) {
            if (i < 10 && even)
                System.out.println("четное однозначное число");
            else if (i < 10 && !even)
                System.out.println("нечетное однозначное число");
            else if (i < 100 && even)
                System.out.println("четное двузначное число");
            else if (i < 100 && !even)
                System.out.println("нечетное двузначное число");
            else if (i < 1000 && even)
                System.out.println("четное трехзначное число");
            else if (i < 1000 && !even)
                System.out.println("нечетное трехзначное число");
        }
    }
}
