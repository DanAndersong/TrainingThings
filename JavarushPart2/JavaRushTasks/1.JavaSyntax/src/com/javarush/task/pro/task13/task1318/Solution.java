package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        //на случай если, в будущем добавят больше месяцев в году
        return month.ordinal() < Month.values().length - 1 ?
                Month.values()[month.ordinal() + 1]
                : Month.values()[0];
    }
}
