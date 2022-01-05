package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> stuff = new HashMap<>();
        stuff.put("Анисимов", 400);
        stuff.put("Рукалицев", 300);
        stuff.put("фАфнисимова", 40);
        stuff.put("фауАнисимович", 200);
        stuff.put("мыАнисимовф", 30);

        stuff.put("мяАнисимовфа", 10);
        stuff.put("кцАнисимовфаы", 600);
        stuff.put("макАнисимовпкф", 300);
        stuff.put("мыфАнисимовфым", 400);
        stuff.put("мыфпрАнисимовфыа", 540);
        return stuff;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}