package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

//        for (int i = 1; i <= num ; i++) { //этот вариант лучше, но в задаче условие присутствия while
//            System.out.println(str);
//        }

        int i = 1;
        while (i <= num){
            System.out.println(str);
            i++;
        }
    }
}
