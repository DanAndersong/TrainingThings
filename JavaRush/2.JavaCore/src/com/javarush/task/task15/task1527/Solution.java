package com.javarush.task.task15.task1527;

import javax.crypto.Mac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        reader.close();
        String result1 = url.replaceAll(".+\\?","");
        String[] split = result1. split("&");
        for (int i = 0; i < split.length; i++) {
            String result = split[i].replaceAll("=.+", "");
            System.out.print(result + " ");

            if (i == split.length-1) System.out.print("\n");
        }

        for (String e : split) {
            if (e.contains("obj")) {
                String val = e.replaceAll("obj=", "");

                try {
                    alert(Double.parseDouble(val));
                }catch (NumberFormatException error){
                    alert(val);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
