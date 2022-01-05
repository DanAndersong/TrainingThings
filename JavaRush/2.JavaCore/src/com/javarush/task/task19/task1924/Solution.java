package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static
    {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws IOException {
//        System.setIn(new ByteArrayInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1924/text".getBytes()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] split = line.split(" ");

            for (int i = 0; i < split.length; i++) {
                String punct = split[i].replaceAll("[^\\p{Punct}]", "");
                String word = split[i].replace(punct,"");

                if (isNumeric(word)){
                    if (map.containsKey(Integer.parseInt(word))){
                        split[i] = map.get(Integer.parseInt(word)) + punct;
                    }
                }
            }

            for (int i = 0; i < split.length; i++) {
                System.out.print(split[i]);
                if (i != split.length-1){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        fileReader.close();
    }
    public static Boolean isNumeric (String s) {
        try {
            double d = Double.parseDouble(s);
        }catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
