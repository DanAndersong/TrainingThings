package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int start = 0;
        int mid = array.length/2;
        int end = array.length;

        if (array.length%2==0) {
            Arrays.fill(array,start,mid,valueStart);
            Arrays.fill(array,mid,end,valueEnd);
        } else {
            Arrays.fill(array,start,mid+1,valueStart);
            Arrays.fill(array,mid+1,end,valueEnd);
        }

        System.out.println(Arrays.toString(array));
    }
}
