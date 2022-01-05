package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = reader.readLine();
        double td = Double.parseDouble(t) % 5;
        if (td >= 4.0 && td < 5.0)
            System.out.println("красный");
        else if (td >= 3.0 && td < 4.0)
            System.out.println("желтый");
        else if (td >= 0.0 && td < 3.0)
            System.out.println("зеленый");
    }
}