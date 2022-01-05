package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        if (x <= 0 || y <= 0) throw new Exception();

        while (x > y) {
            x -= y;
        }
        while (y > x) {
            y -= x;
        }
        while (x > y) {
            x -= y;
        }

        System.out.println(x);

//        !OR!
//
//        int nod = nod(x, y);
//        System.out.println(nod);
//        reader.close();

    }

    static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }
}
