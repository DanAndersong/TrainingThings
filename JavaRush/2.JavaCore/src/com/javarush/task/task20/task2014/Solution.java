package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/file");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        Solution savedObject = new Solution(35);
        oos.writeObject(savedObject);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Solution loadedObject = (Solution)ois.readObject();

        System.out.println(savedObject.string.equals(loadedObject.string));
        System.out.println(savedObject.temperature == loadedObject.temperature);
        ois.close();
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
