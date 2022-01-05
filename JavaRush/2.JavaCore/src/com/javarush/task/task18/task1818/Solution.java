package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(reader.readLine());
        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[100];

        while (file2.available() > 0) {
            int count = file2.read(buffer);
            file1.write(buffer,0,count);
        }
        while (file3.available() > 0) {
            int count = file3.read(buffer);
            file1.write(buffer,0,count);
        }
        file1.close();
        file2.close();
        file3.close();
    }
}
