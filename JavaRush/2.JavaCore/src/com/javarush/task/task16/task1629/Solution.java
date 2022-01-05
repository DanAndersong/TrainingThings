package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        t1.start();
        t1.join();
        Read3Strings t2 = new Read3Strings();
        t2.start();
        t2.join();
        reader.close();

        t1.printResult();
        t2.printResult();

    }
    public static class Read3Strings extends Thread {
        ArrayList<String> stringsArr;

        public Read3Strings() {
            stringsArr = new ArrayList<>();
        }
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    stringsArr.add(reader.readLine());
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public void printResult () {
            for (String s : stringsArr) System.out.print(s + " ");
            System.out.print("\n");
        }
    }

    //add your code here - добавьте код тут
}
