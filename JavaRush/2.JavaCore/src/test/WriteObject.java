package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Cat cat = new Cat(1,"A");
        Cat cat2 = new Cat(2,"AB");

        try {
            FileOutputStream fos = new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/test/cats.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(cat);
            oos.writeObject(cat2);

            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
