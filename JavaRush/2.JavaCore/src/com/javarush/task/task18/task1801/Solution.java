package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        int result = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            if (b > result) result = b;
        }
        System.out.println(result);
        fileInputStream.close();
    }
}
