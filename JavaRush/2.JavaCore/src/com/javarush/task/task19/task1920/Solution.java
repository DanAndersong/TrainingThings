package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

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
        double maxValue = Collections.max(map.values());

        for (Map.Entry<String,Double> pair : map.entrySet()){
            if (pair.getValue().equals(maxValue)){
                System.out.println(pair.getKey());
            }
        }
        bufferedReader.close();
    }
}
