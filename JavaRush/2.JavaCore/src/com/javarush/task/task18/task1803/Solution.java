package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
        ArrayList<Integer> bytes = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0)
            bytes.add(fileInputStream.read());

        fileInputStream.close();
        Collections.sort(bytes);

        int count = 1;
        for (int i = 0; i < bytes.size()-1; i++) {
            if (bytes.get(i).equals(bytes.get(i+1))) count++;
            if (!bytes.get(i).equals(bytes.get(i+1)) || i == bytes.size()-2){
                map.put(bytes.get(i),count);
                count = 1;
            }
        }

        int max = Collections.max(map.values());
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            if (pair.getValue().equals(max)) System.out.print(pair.getKey() + " ");
        }
    }
}

