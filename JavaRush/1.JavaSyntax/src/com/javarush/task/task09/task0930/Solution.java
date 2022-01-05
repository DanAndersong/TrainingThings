package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listNum = new ArrayList<>();

        for (String s: array){
            if (!isNumber(s))
                list.add(s);
            else listNum.add(s);
        }

        for (int i = list.size() - 1; i >= 1; i--) {

            for (int in = 0; in < i; in++){
                String s;
                if (isGreaterThan(list.get(in), list.get(in+1))) {
                    s = list.get(in);
                    list.set(in, list.get(in+1));
                    list.set(in + 1, s);
                }
            }
        }

        for (int i = listNum.size() - 1; i >= 1; i--) {

            for (int in = 0; in < i; in++){
                String s;
                int a = Integer.parseInt(listNum.get(in));
                int b = Integer.parseInt(listNum.get(in+1));

                if (a < b) {
                    s = listNum.get(in);
                    listNum.set(in,listNum.get(in+1));
                    listNum.set(in + 1, s);
                }
            }
        }
        list.addAll(listNum);
        for (int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
