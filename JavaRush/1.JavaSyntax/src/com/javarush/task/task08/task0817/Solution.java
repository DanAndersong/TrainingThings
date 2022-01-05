package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "3");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> keys = new ArrayList<>();
        for(Map.Entry<String,String> pair : map.entrySet()) {
            int counter = 0;
            String value = pair.getValue();

            for (Map.Entry<String,String> pair2 : map.entrySet()) if (value.equals(pair2.getValue())) counter++;
            if (counter > 1) keys.add(value);
        }

        for (String s : keys) removeItemFromMapByValue(map, s);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        Map<String,String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        for(Map.Entry<String,String> pair : map.entrySet())
//            System.out.println(pair);
    }
}
