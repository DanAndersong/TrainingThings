package com.javarush.task.pro.task12.task1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Сортировка пузырьком
*/

public class Solution {

    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - i - 1; j++) {
//                if (numbers.get(j) > numbers.get(j + 1)) {
//                    int temp = numbers.get(j);
//                    numbers.set(j, numbers.get(j + 1));
//                    numbers.set(j + 1, temp);
//                }
//            }
//        }
// OR
        for (int i = numbers.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
// OR
//        Arrays.sort(numbers);
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
