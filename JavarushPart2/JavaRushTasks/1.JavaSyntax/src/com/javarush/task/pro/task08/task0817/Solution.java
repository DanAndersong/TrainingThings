package com.javarush.task.pro.task08.task0817;

/* 
Инкременты
*/

public class Solution {

    public static void main(String[] args) {
        int a = 3;//20

                //4 + (4 * 4)
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}