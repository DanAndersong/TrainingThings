package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1, name2, name3;
        name1 = reader.readLine();
        name2 = reader.readLine();
        name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = " + "Чистая любовь, да-да!");
    }
}