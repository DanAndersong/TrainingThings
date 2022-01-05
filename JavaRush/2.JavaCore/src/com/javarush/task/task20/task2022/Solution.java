package com.javarush.task.task20.task2022;

import org.ietf.jgss.Oid;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }
    public Solution(String fileName, Boolean b) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName, b);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2022/file");
        solution.writeObject("ABCD");
        solution.writeObject("EFG");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2022/file2"));
        objectOutputStream.writeObject(solution);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2022/file2"));
        Solution solution1 = (Solution)objectInputStream.readObject();
        objectInputStream.close();
        solution1.writeObject("111");
    }
}