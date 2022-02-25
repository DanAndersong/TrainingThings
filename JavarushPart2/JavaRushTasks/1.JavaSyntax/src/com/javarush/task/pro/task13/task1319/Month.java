package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    static public Month[] getWinterMonths() {
        return new Month[] {DECEMBER, JANUARY, FEBRUARY};
    }
    static public Month[] getSpringMonths() {
        return new Month[] {MARCH, APRIL, MAY};
    }
    static public Month[] getSummerMonths() {
        return new Month[] {JUNE, JULY, AUGUST};
    }
    static public Month[] getAutumnMonths(){
        return new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
