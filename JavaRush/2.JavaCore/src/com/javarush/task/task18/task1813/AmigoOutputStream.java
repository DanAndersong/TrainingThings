package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException{
        super(AmigoOutputStream.fileName);
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }

    @Override
    public FileChannel getChannel() {
        return fileOutputStream.getChannel();
    }
}
