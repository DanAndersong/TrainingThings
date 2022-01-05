package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            firstList.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < firstList.size(); i++) {
            if (firstList.get(i) % 3 == 0) list3.add(firstList.get(i));
            if (firstList.get(i) % 2 == 0) list2.add(firstList.get(i));

            if (firstList.get(i) % 2 != 0 && firstList.get(i) % 3 != 0)
                listOther.add(firstList.get(i));
        }

        printList(list3);
        printList(list2);
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
