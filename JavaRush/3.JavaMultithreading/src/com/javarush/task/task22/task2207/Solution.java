package com.javarush.task.task22.task2207;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        reader.close();
        List<String> words = new ArrayList<>();

        while (fileReader.ready()) {
            String[] lines = fileReader.readLine().split(" ");
            Collections.addAll(words, lines);
        }

        while (!words.isEmpty()) {
            String word = words.get(0);
            StringBuilder reverseWord = new StringBuilder().append(words.get(0)).reverse();
            words.remove(0);

            for (String word2 : words) {
                if (word2.equals(reverseWord.toString())){
                    boolean repeat = false;

                    for (Pair Pair : result) {
                        if (Pair.first.equals(word)) {
                            repeat = true;
                            break;
                        }
                    }
                    if (repeat) break;
                    Pair newPair = new Pair();
                    newPair.first = word;
                    newPair.second = word2;
                    result.add(newPair);
                }
            }
        }
        result.forEach(System.out::println);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
