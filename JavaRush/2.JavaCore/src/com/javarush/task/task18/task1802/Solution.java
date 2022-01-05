package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(
                                                new InputStreamReader(System.in)).readLine());
        int result = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            if (b < result) result = b;
        }
        System.out.println(result);
        fileInputStream.close();

    }
}
