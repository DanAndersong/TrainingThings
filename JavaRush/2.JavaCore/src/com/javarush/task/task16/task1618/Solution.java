package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(4000);
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                        System.out.println("tic");
                        Thread.sleep(1500);
                }
            }catch (InterruptedException e) {
                System.out.println("break");
            }
        }
    }
}