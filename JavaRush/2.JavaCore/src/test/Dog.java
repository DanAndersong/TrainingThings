package test;

import java.io.*;

public class Dog {
    public static void main(String[] args) throws IOException
    {
        OutputStream fileOutputStream = new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/test/text");

        fileOutputStream.write("iorgnurognu4onfa".getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static void readAndPrintLine() throws IOException
    {
        System.setIn(new ByteArrayInputStream("test".getBytes()));
//        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
//        isr.close();
    }

}
