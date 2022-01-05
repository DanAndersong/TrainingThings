package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(printStream);

        String[] s = byteArrayOutputStream.toString().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        int result = 0;
        switch (s[1]){
            case "+": { result = a + b; break; }
            case "-": { result = a - b; break; }
            case "*": { result = a * b; break; }
        }
        System.out.println(String.format("%d %s %d = %d",a, s[1], b, result));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

