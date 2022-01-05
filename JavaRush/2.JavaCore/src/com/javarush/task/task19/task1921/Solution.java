package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
//        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedReader reader = new BufferedReader(new FileReader("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1921/text"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        while (reader.ready()){
            String str = reader.readLine();
            String name = str.replaceAll("\\d","").trim();
            Date date = simpleDateFormat.parse(str.replace(name, "").trim());
            PEOPLE.add(new Person(name, date));
        }
        reader.close();
    }
}
