package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static CanFly result;

    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = reader.readLine();
            if (s.equals("helicopter")) result = new Helicopter();
            if (s.equals("plane")) {
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
            }
            reader.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
