package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader in = new FileReader("/Users/user/Desktop/tests/1/int.txt");// для корректного отображения
                                                                                      // кириллицы я использовал FileReader
        int i = in.read();
        try {
            while (i > 0){
                System.out.print((char)i);
                i = in.read();
            }
        }catch (Exception e){
            e.getStackTrace();
        }finally {
            in.close();
            reader.close();
        }
    }
}