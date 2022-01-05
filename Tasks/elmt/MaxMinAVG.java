package elmt;

import java.util.Random;

public class MaxMinAVG {
    public static void main(String[] args) {
        int[] massive = new int[100];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(100);
        }
        int min, max, avg;
        min = massive[0];
        max = massive[0];
        avg = massive[0];

        for (int i = 0; i < massive.length; i++) {
            int value = massive[i];
            System.out.println(value);
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            avg += value / massive.length;
        }
        System.out.println("Min: " + min + "\nMax: " + max + "\nAvg: " + avg);
    }
}
