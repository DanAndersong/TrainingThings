package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
//        System.setIn(new ByteArrayInputStream(("/Users/user/Googledrive/javaRush/JavaRushTasks/" +
//                "2.JavaCore/src/com/javarush/task/task18/task1822/text").getBytes()));

        FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        Scanner scanner = new Scanner(fileInputStream);
        List<String>list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

        for (String s : list) {
            if (s.startsWith(args[0] + " ")) {
                System.out.println(s);
            }
        }
        fileInputStream.close();
        scanner.close();
    }
}
