package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[3];
        for (int i = 0; i < list.length ; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
            Arrays.sort(list);
            System.out.println(list[1]);
    }

}
