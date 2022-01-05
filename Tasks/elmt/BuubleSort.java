package elmt;

import java.util.Random;

public class BuubleSort {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = array.length-1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("index: " + i + " val: " + array[i]);
        }
    }
}
