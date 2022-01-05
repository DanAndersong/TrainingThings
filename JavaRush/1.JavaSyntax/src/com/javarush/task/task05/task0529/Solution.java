package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> allNums = new ArrayList<String>();
        String num;
        int summ = 0;

        while (true) {
            allNums.add(num = reader.readLine());
            if (num.equals("сумма"))
                break;
        }

        allNums.remove(allNums.size()-1);

        for (int i = 0; i < allNums.size() ; i++) {
            summ += Integer.parseInt(allNums.get(i));
        }

        System.out.println(summ);
    }
}


