package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder where = new StringBuilder();

        for (String key : params.keySet()){
            if (params.get(key) != null) {
                where.append(String.format("%s = '%s' and ", key, params.get(key)));
            }
        }
        if (where.length() > 0) return where.substring(0, where.length()-5);
        return "";
    }
}
