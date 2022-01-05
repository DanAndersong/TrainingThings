package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        double space = 0;
        double symbols = fileInputStream.available();

        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 32)
                space++;
        }
        System.out.printf("%.2f", space/symbols * 100);
        fileInputStream.close();
    }
}
