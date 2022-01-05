package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fileReader.ready()){
            int count = 0; // совпадения по массиву words
            String line = fileReader.readLine();
            String[] split = line.replaceAll("\\p{Punct}", "").split(" ");

            for (String s : split){
                if (words.contains(s)){
                    count++;
                }
            }
            if (count == 2)
                System.out.println(line);
        }
        fileReader.close();
    }
}
