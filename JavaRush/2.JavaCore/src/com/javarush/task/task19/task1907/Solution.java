package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        int count = 0;
        while (bufferedReader.ready()) {
            String[] spell = bufferedReader.readLine().split("\\W");
            for (String s : spell) {
                if (s.equals("world")){
                    count++;
                }
            }
        }
        System.out.println(count);
        bufferedReader.close();
    }
}
