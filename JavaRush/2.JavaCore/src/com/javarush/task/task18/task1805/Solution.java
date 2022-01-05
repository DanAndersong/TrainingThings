package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
//        FileInputStream fileInputStream = new FileInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1805/file");
        int[] bytes = new int[256];

        while (fileInputStream.available() > 0) bytes[fileInputStream.read()]++;

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > 0)
            System.out.print(i + " ");
        }
        fileInputStream.close();
    }
}
