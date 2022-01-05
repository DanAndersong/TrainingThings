package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream= new FileOutputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[inputStream.available()];
        int count = inputStream.read(buffer);

        reverse(buffer);
        outputStream.write(buffer,0,count);

        inputStream.close();
        outputStream.close();
    }

    public static void reverse (byte[] array) {
        for (int i = 0; i < array.length/2; i++) {
            byte temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
