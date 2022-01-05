package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("dee", "jonson");
        map.put("fade", "jonson");
        map.put("dame", "bruk");
        map.put("afsoda", "bruk");
        map.put("sada", "bruk");

        map.put("ash", "bruk");
        map.put("ashsa", "hames");
        map.put("alishsa", "morgan");
        map.put("logi", "sanchez");
        map.put("philippe", "sanchez");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) i++;
        }
        return i;
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "dree"));
//        System.out.println(getCountTheSameLastName(map, "bruk"));
    }
}
