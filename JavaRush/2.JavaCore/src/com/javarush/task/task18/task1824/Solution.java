package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<FileInputStream> list = new ArrayList<>();
        String fileName = "";

        while (true){
            try {
                fileName = reader.readLine();
                list.add(new FileInputStream(fileName));
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                reader.close();
                break;
            }
        }
        for (FileInputStream fileInputStream : list) {
            fileInputStream.close();
        }
    }
}
