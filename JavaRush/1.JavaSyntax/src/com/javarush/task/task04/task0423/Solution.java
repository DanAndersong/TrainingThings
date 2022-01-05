package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        if (age > 20)
            System.out.println("И 18-ти достаточно");

    }
}
