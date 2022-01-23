package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = s.nextLine();
        }


        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                boolean same = false;

                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null) {
                        if (strings[j].equals(strings[i])) {
                            strings[j] = null;
                            same = true;
                        }
                    }
                }
                if (same) {
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
