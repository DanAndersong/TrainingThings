package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double AB, AC, BC;
        AC = (x2 - x1);
        BC = (y2 - y1);
        AB = Math.sqrt((AC*AC + BC*BC));
        return AB;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(3,3,7,5));
    }
}
