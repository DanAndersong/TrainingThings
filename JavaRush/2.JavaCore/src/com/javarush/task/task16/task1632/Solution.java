package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new GetMessage());
        threads.add(new Thread(new Infinity()));
        threads.add(new Thread(new Interrupted()));
        threads.add(new Thread(new VoiceUra()));
        threads.add(new Thread(new Nums()));
    }

    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
    }

    public static class Infinity implements Runnable {
        @Override
        public void run() {
            while (true) {

            }
        }
    }
    public static class Interrupted implements Runnable {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class VoiceUra implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }catch (InterruptedException e) {

                }
            }
        }
    }
    public static class GetMessage extends Thread implements Message, Runnable {
        boolean repeat = true;

        @Override
        public void showWarning() {
            repeat = false;
        }

        @Override
        public void run() {
            while (repeat);
        }
    }
    public static class Nums implements Runnable {
        @Override
        public void run() {
            ArrayList<Integer> nums = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in ));
            long summ = 0;
            while (true) {
                try {
                    String n = reader.readLine();
                    if (n.equals("N"))break;
                    summ += Integer.parseInt(n);
                }catch (IOException e) { }
            }
            System.out.println(summ);
        }
    }

}