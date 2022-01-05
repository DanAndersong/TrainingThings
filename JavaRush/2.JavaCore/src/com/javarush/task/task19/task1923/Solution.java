package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

        while (bufferedReader.ready()){
            String[] split = bufferedReader.readLine().split(" ");

            for (String s : split) {
                if (s.replaceAll("[^0-9]","").length() > 0) {
                    bufferedWriter.write(s + " ");
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
