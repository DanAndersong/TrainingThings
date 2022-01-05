package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        long[] bytes = new long[256];

        while (fileInputStream.available() > 0) bytes[fileInputStream.read()]++;

        long count = 0;
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > count){
                count = bytes[i];
            }
        }

        for (int i = 0; i < bytes.length; i++) {
            if  (bytes[i] < count && bytes[i] != 0) {
                count = bytes[i];
            }
        }

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == count) {
                System.out.print(i + " ");
            }
        }
        fileInputStream.close();
        reader.close();
    }
}
