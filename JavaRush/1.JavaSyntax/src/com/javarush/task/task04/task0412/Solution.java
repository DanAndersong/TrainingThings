package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        int result = 0;

        if (i > 0)
            result = i * 2;
        else if (i < 0)
            result = i+1;

        System.out.println(result);

    }

}