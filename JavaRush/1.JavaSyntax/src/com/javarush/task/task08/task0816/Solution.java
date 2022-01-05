package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();

        map.put("Pol", dateFormat.parse("MAY 1 2012"));
        map.put("Dee", dateFormat.parse("JANUARY 13 1939"));
        map.put("Dry", dateFormat.parse("APRIL 30 1994"));
        map.put("Colin", dateFormat.parse("APRIL 3 1996"));
        map.put("Phill", dateFormat.parse("JUNE 18 1984")); //summer

        map.put("Dryd", dateFormat.parse("APRIL 20 1966"));
        map.put("Bee", dateFormat.parse("OCTOBER 10 1999"));
        map.put("John", dateFormat.parse("FEBRUARY 10 1999"));
        map.put("Philippe", dateFormat.parse("DECEMBER 1 1965"));
        map.put("Dobe", dateFormat.parse("JULY 1 2015")); //summer

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Set<String> mounthThree = new HashSet<>();
        mounthThree.add("Jun");
        mounthThree.add("Jul");
        mounthThree.add("Aug");

        Iterator<Map.Entry<String, Date>> iterator =  map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();

            for (String mounth : mounthThree) {
                if (pair.getValue().toString().contains(mounth)) {
                    iterator.remove();
                }
            }
        }
    }

    public static void main(String[] args) throws ParseException {
//        Map <String, Date> map = createMap();
//        removeAllSummerPeople(map);
//
//        for (Map.Entry<String, Date> pair : map.entrySet())
//            System.out.println(pair);
    }
}
