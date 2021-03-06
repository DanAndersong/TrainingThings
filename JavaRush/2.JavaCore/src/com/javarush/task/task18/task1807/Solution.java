package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
        int count = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == (byte)',') {
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
