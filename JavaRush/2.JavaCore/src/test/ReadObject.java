package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/test/cats.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Cat cat1 = (Cat)ois.readObject();
            Cat cat2 = (Cat)ois.readObject();

            ois.close();

            System.out.println(cat1);
            System.out.println(cat2);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
