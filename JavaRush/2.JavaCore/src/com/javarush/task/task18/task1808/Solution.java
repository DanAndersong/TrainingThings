package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        reader.close();

        // переменная с постоянным значением
        int i = inputStream.available();

        while (inputStream.available() > i/2) {
            outputStream.write(inputStream.read());
        }
        while (inputStream.available() > 0){
            outputStream2.write(inputStream.read());
        }
        inputStream.close();
        outputStream.close();
        outputStream2.close();
    }
}
