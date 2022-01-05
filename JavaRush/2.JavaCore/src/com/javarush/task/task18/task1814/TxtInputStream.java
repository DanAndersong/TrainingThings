package com.javarush.task.task18.task1814;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream{

    public TxtInputStream(String path) throws IOException, UnsupportedFileNameException {
        super(path);
        if (!path.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }

    }

    public static void main(String[] args) throws IOException {
    }
}

