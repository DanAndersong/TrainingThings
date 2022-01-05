package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.SocketException;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {

        //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[0];
            arr[0] = 1;
        }catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object[] x = new String[1];
            x[0] = new Integer(0);
        }catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            Object x = new String();
            System.out.println((Integer) x);
        }catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String s = "A";
            int i = Integer.parseInt(s);
            System.out.println(i);
        }catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[-1];
        }catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("123");
        }catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();
        }catch (IndexOutOfBoundsException e ){
            exceptions.add(e);
        }

        try {
            throw new SecurityException();
        }catch (SecurityException e ){
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        }catch (IllegalArgumentException e ){
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
