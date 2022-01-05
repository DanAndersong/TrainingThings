package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1820/text2");
//        FileInputStream fileInputStream = new FileInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1820/text");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        String line = "";
        while (fileInputStream.available() > 0) {
            line += (char)fileInputStream.read();
        }

        String[] arr2 = line.split("\\s");

        for (String s : arr2) {
            String str = Math.round(Double.valueOf(s)) + " ";
            fileOutputStream.write(str.getBytes());
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
