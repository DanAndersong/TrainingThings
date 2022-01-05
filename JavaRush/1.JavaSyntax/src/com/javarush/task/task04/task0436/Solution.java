package com.javarush.task.task04.task0436;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(reader.readLine());
        int col = Integer.parseInt(reader.readLine());
        for (int j = 1; j <= row; j++) {
            for (int i = 1; i <= col; i++)
                System.out.print(8);
            System.out.println();
        }
    }
}
