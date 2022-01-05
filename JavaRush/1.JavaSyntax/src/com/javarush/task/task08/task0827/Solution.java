package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* 
Работа с датой

*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 01 2013"));

    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date firstDate2 = formatter.parse(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(firstDate2);
        int i = calendar.get(Calendar.DAY_OF_YEAR);

        boolean result = false;
        if (i % 2 != 0) result = true;
        return result;
    }

}
