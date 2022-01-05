package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1909/text"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1909/text2"));
        reader.close();

        while (bufferedReader.ready()){
           bufferedWriter.write(bufferedReader.readLine().replaceAll("\\.","!"));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
