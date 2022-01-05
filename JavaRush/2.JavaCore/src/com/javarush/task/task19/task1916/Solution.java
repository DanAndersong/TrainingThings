package com.javarush.task.task19.task1916;

import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException, InterruptedException {
        Date date = new Date();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/text"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/text2"));
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
//        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        List<String> lsit1 = new ArrayList<>();
        List<String> lsit2 = new ArrayList<>();

        while (bufferedReader.ready()){
            lsit1.add(bufferedReader.readLine());
        }
        while (bufferedReader2.ready()){
            lsit2.add(bufferedReader2.readLine());
        }
        bufferedReader.close();
        bufferedReader2.close();
//        0строка1         0строка1            SAME строка1
//        1строка2        1                    REMOVED строка2
//        2строка3        2 1строка3            SAME строка3
//        3строка4        3                    REMOVED строка4
//        4строка5        4 2строка5            SAME строка5
//       5                5 3строка0            ADDED строка0
//       6 5строка1       6 4строка1            SAME строка1
//       7 6строка2       7                    REMOVED строка2
//       8 7строка3       8 5строка3            SAME строка3
//       9                9 6строка4            ADDED строка4
//       10 8строка5      10 7строка5            SAME строка5
//                        11 9строка0         Added строка0

        int count = 0;
        for (int i = 0; i < lsit1.size(); i++) {
                try {
                    if (!lsit1.get(i).equals(lsit2.get(count))){
                        if (lsit1.get(i).equals(lsit2.get(count + 1))) {
                            lsit1.add(i, "");
                        } else {
                            lsit2.add(count, "");
                        }
                    }
                }catch (IndexOutOfBoundsException e){
                    lsit2.add("");
                }
            if (lsit1.size() == i + 1) {
                if (lsit1.size() < lsit2.size()){
                    lsit1.add("");
                    i++;
                }
            }
            if (lsit2.size() == count) {
                if (lsit1.size() > lsit2.size()){
                    lsit2.add("");
                }
            }
            count++;
        }

        for (int i = 0; i < lsit1.size(); i++) {
            if (lsit1.get(i).equals(lsit2.get(i))) {
                lines.add(new LineItem(Type.SAME, lsit1.get(i)));
            }else if (lsit1.get(i).length() == 0) {
                lines.add(new LineItem(Type.ADDED, lsit2.get(i)));
            }else if (lsit2.get(i).length() == 0) {
                lines.add(new LineItem(Type.REMOVED, lsit1.get(i)));
            }
        }
        Date date2 = new Date();

        System.out.println(date2.getTime() - date.getTime());
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
