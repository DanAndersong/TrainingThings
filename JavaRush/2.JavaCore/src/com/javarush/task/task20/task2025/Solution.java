package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] amstrongNums = new long[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084,
                548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208,
                472335975, 534494836, 912985153, 4679307774L, 32164049650L, 32164049651L, 40028394225L,
                42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L,
                4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L,
                1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L
        };
        ArrayList<Long> tmpList = new ArrayList<>();

        for (int i = 0; i < amstrongNums.length; i++) {
            if (amstrongNums[i] >= N) {
                break;
            }else {
                tmpList.add(amstrongNums[i]);
            }
        }
        long[] result = new long[tmpList.size()];
        for (int i = 0; i < tmpList.size(); i++) {
            result[i] = tmpList.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        getNumbers(3289582984443187032L);
    }
}
