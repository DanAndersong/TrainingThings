package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String fileName = reader.readLine();
            if (!fileName.equals("exit")) {
                new ReadThread(fileName).start();
            }else {
                break;
            }
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            FileInputStream fileInputStream = null;
            int[] bytes = new int[256];

            try {
                fileInputStream = new FileInputStream(fileName);

                while (fileInputStream.available() > 0) {
                    bytes[fileInputStream.read()]++;
                }
                fileInputStream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
            int max = bytes[0];
            int index = 0;

            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] > 0 && bytes[i] > max) {
                    max = bytes[i];
                    index = i;
                }
            }
            synchronized (resultMap) {
                resultMap.put(fileName,index);
            }
        }
    }
}
