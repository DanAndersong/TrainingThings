package com.javarush.task.task18.task1825;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String fileName;

        while (true){
            fileName = reader.readLine();
            if (!fileName.equals("end")){
                list.add(fileName);
            }else break;
        }

        Collections.sort(list);
        fileName = list.get(0).substring(0, list.get(0).lastIndexOf(".")); // Формирование имени основного файла

        for (String s : list) {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            FileInputStream fileInputStream = new FileInputStream(s);

            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0,count);

            fileOutputStream.close();
            fileInputStream.close();
        }
    }
}
