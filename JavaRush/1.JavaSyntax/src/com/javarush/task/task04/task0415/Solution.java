package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aS, bS, cS;
        int aI, bI, cI;
        aS = reader.readLine();
        bS = reader.readLine();
        cS = reader.readLine();
        aI = Integer.parseInt(aS);
        bI = Integer.parseInt(bS);
        cI = Integer.parseInt(cS);

        if (aI + bI > cI && bI + cI > aI && aI + cI > bI)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }

}
