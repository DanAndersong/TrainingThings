package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] bytes = new int[256];
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        while (fileInputStream.available() > 0) {
            bytes[fileInputStream.read()]++;
        }

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] != 0) {
                System.out.println((char)i + " " + bytes[i]);
            }
        }
        fileInputStream.close();
    }
}
