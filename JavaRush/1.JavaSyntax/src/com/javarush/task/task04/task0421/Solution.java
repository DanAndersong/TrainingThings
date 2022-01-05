package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        boolean bool = checkSpell(name1, name2);
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (bool == true)
            System.out.println("Длины имен равны");
    }

     static boolean checkSpell(String a, String b){
        String[] check1 = a.split("");
        String[] check2 = b.split("");
        if (check1.length == check2.length)
            return true;
        else
            return false;
    }
}
