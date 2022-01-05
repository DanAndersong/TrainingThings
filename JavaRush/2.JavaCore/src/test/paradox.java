package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class paradox {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        new ObjectOutputStream(new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/test/text")).writeObject(cat);
    }

}
