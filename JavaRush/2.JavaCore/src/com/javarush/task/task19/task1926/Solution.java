package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        System.setIn(new ByteArrayInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1926/text".getBytes()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (bufferedReader.ready()){
            String[] split = bufferedReader.readLine().split("");
            for (int i = split.length-1; i >= 0; i--) {
                System.out.print(split[i]);
                if (i == 0){
                    System.out.println();
                }
            }
        }
        bufferedReader.close();
    }
}
