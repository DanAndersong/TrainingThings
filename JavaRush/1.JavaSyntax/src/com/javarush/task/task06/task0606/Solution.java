package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> nums = new ArrayList<>();
        long i = Integer.parseInt(reader.readLine());

        while (i != 0) {
            nums.add(i % 10);
            i /= 10;
        }

        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) % 2 != 0)
                 Solution.odd++;
            else Solution.even++;
        }

        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
}
