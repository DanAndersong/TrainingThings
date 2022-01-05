package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (bufferedReader.ready()) {
            String[] split = bufferedReader.readLine().split(" ");
            for (String s : split) {
                if (isNumeric(s)) {
                    System.out.println(s);
                    bufferedWriter.write(s + " ");
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static Boolean isNumeric (String s) {
        try {
            double d = Double.parseDouble(s);
        }catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
