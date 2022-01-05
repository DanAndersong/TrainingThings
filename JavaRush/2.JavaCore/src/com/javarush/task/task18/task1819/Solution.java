package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileOne);
        FileInputStream fileInputStream2 = new FileInputStream(fileTwo);
        ArrayList<Integer> arr = new ArrayList<>();

        while (fileInputStream2.available() > 0) {
            arr.add(fileInputStream2.read());
        }
        while (fileInputStream.available() > 0) {
            arr.add(fileInputStream.read());
        }

        FileOutputStream fileOutputStream = new FileOutputStream(fileOne);
        for (int i : arr) {
            fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
