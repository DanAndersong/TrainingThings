package com.javarush.task.pro.task10.task1020;

import java.util.Locale;

public class Computer {
    public Computer() {
        new Keyboard();
        new Monitor();
        new Mouse();
        new SystemUnit();

    }

    public static void main(String[] args) {
        String c = "count";
        String b = "count";
        String d = "1count";
        String str = new String("count");
        String sstr = new String("count");
        System.out.println(str == c);
    }
}
