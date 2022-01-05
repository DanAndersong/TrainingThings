package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();

        while (bufferedReader.ready()){
            String[] split = bufferedReader.readLine().split(" ");
            if (map.containsKey(split[0])){
                map.put(split[0], map.get(split[0]) + Double.parseDouble(split[1]));
            }else {
                map.put(split[0], Double.parseDouble(split[1]));
            }
        }
        map.forEach((a,b) -> System.out.println(a + " " + b));
        bufferedReader.close();
    }
}
