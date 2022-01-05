package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        Thread thread = Thread.currentThread();
        public RacingClock() {
            start();
        }

        public void run() {
                try {
                    while (!thread.isInterrupted()){
                        Thread.sleep(1000);
                        System.out.print(numSeconds-- + " ");
                        if (numSeconds == 0) {
                            System.out.println("Марш!"); return;
                        }
                    }
                }catch (InterruptedException e) {
                    System.out.println("Прервано!");
                }
        }
    }
}
