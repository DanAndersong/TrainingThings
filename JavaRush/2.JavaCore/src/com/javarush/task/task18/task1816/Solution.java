package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        Set<Integer> set = new HashSet<>();
        int result = 0;
        //65-90 A-Z
        //97-122 a-z
        int count = 65;
        while (count < 123) {
            if (count == 91) {
                count = 97;
            }
            set.add(count++);
        }

        while (fileInputStream.available() > 0) {
            if (set.contains(fileInputStream.read()))
                result++;
        }
        System.out.println(result);
        fileInputStream.close();
    }
}
