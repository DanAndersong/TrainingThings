package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        System.out.println(Arrays.toString(memory));
        executeDefragmentationFaster(memory);
        System.out.println(Arrays.toString(memory));
    }

//    public static void executeDefragmentation(String[] array) {
//        for(int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] == null && array[j+1] != null) {
//                    String tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                }
//            }
//        }
//    }

    public static void executeDefragmentationFaster(String[] array) {
        String[] tmp = new String[array.length];

        for (int i = 0, tmpCount = 0; i < array.length;i++) {
            if (array[i] != null) {
                tmp[tmpCount++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tmp[i];
        }
    }
}
