package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        Properties property = new Properties();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream is = new FileInputStream(reader.readLine());

        property.load(is);
        properties = property.entrySet().stream().collect(Collectors.toMap(
                e -> String.valueOf(e.getKey()),
                e -> String.valueOf(e.getValue())));

        load(is);
        reader.close();
        is.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter printWriter = new PrintWriter(outputStream);
        Properties property = new Properties();
        property.putAll(properties);
        property.store(printWriter, "");
    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));
        Properties property = new Properties();
        property.load(fileReader);
        fileReader.close();

        properties = property.entrySet().stream().collect(Collectors.toMap(
                e -> String.valueOf(e.getKey()),
                e -> String.valueOf(e.getValue())));
    }

    public static void main(String[] args) throws Exception {
//        OutputStream os = new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2003/file2");
//        new Solution().fillInPropertiesMap();
//        new Solution().save(os);
//        os.close();
//        InputStream is = new FileInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2003/file2");
//        new Solution().load(is);
//        is.close();
    }
}
