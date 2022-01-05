package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
//        for (int i = 0; i < 20; i++) {
//            words.add(reader.readLine());
//        }
        words.add("Мама мыла раму");
        words.add("Мама мыла раму");
        words.add("Мама Мыла раму");

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

//        ДЛЯ ПОЛНОЦЕННЫХ СТРОК (считает каждое слово в строке)
//
//        ArrayList<String> words = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            Collections.addAll(words,list.get(i).split(" "));
//        }
//
//        for (int i = 0; i < words.size();i++) {
//            int count = 0;
//            if (result.containsKey(words.get(i))) continue;
//
//            for (int j = 0; j < words.size(); j++) {
//                if (words.get(i).equals(words.get(j))) count++;
//            }
//            result.put(words.get(i), count);
//        }

//       ДЛЯ СЛОВ ПО ЗАДАНИЮ
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int count = 0;

            for(int j = 0; j < list.size(); j++){
                if(s.equalsIgnoreCase(list.get(j))) count++;
            }
            result.put(s, count);
        }
        return result;
    }
}

