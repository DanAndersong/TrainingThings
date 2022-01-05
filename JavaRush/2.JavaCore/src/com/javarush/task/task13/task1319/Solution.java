package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fWriter = new FileWriter(reader.readLine());
        BufferedWriter bufferedWriter = new BufferedWriter(fWriter);

        try {
            while (true) {
                String data = reader.readLine();
                bufferedWriter.write(data + "\n");
                if (data.equals("exit")) break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
            bufferedWriter.close();
            fWriter.close();
        }
//        Map<Thread, StackTraceElement[]> threads = Thread.getAllStackTraces();
//        System.out.println("Number of currently running threads: " + threads.size());
//        for (Thread thread : threads.keySet()) {
//            System.out.println(thread);
//        }

    }
}
