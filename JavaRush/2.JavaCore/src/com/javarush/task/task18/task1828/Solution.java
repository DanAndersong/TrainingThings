package com.javarush.task.task18.task1828;

/*
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String file = new Scanner(System.in).nextLine();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        List<String> allStr = new ArrayList<>();
        String id = args[1];

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith(id)){
                if (args[0].equals("-d")){
                    continue;
                }
                if (args[0].equals("-u")) {
                    String productName = args[2];
                    String price = args[3];
                    String quantity = args[4];
                    line = String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
                }
            }
            allStr.add(line + "\n");
        }
        bufferedReader.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        for (String s : allStr){
            fileOutputStream.write(s.getBytes());
        }
        fileOutputStream.close();
    }
}
