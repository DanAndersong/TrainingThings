package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(printStream);

        String[] str = byteArrayOutputStream.toString().split(System.getProperty("line.separator"));
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            if (i % 2 != 0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
