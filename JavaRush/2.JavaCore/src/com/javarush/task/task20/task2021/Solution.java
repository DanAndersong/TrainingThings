package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
         private void writeObject(ObjectOutputStream stream) throws IOException {
             throw new NotSerializableException("Don't want to serialize today");
         }

         private void readObject(ObjectInputStream stream) throws IOException {
             throw new NotSerializableException("Don't want to serialize today");
         }

    }

    public static void main(String[] args) throws IOException {
    SubSolution subSolution = new SubSolution();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2021/file"));
    oos.writeObject(subSolution);
    oos.close();
    }
}
