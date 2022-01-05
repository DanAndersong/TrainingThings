package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try (BufferedReader reader1 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(sc.nextLine())))){
            String line;
            int resultNum;
            while ((line = reader1.readLine()) != null) {
                resultNum = Integer.parseInt(line);

                if (resultNum % 2 == 0) {
                    nums.add(resultNum);
                }
            }
        } catch (IOException e) {
            // log error
        }finally {
            sc.close();
        }
        Collections.sort(nums);
        nums.forEach (System.out::println);


    }
}
