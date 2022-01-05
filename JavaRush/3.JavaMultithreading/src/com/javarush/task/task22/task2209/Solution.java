package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                new Scanner(System.in).nextLine())));
        StringBuilder result = getLine(fileReader.readLine().split(" "));
        fileReader.close();
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder stringBuilder = new StringBuilder();

        if (words.length > 0) {
            List<String> list = new ArrayList<>();
            Collections.addAll(list, words);
            Collections.sort(list);

            for (int j = 0; j < list.size(); j++) {
                for (int i = j + 1; i < list.size(); i++) {
                    if (list.get(j).charAt(list.get(j).length() - 1) == list.get(i).toLowerCase().charAt(0)) {
                        String s = list.get(j + 1);
                        list.set(j + 1, list.get(i));
                        list.set(i, s);
                    }
                }
            }
            list.forEach(a -> stringBuilder.append(a + " "));
            return stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        }else {
            return stringBuilder;
        }

    }
}
