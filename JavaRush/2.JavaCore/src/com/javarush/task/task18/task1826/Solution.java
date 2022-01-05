package com.javarush.task.task18.task1826;

/* 
Шифровка
*/
//Так, в конструктор передается либо путь к файлу в виде строки,
//либо объект File, который ссылается на конкретный текстовый файл.
//Параметр append указывает, должны ли данные дозаписываться в конец файла
//(если параметр равен true), либо файл должен перезаписываться.

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream= new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        if (args[0].equals("-e")) {
            while (fileInputStream.available()>0) {
                int i = fileInputStream.read();
                fileOutputStream.write(--i);
            }
        }

        if (args[0].equals("-d")) {
            while (fileInputStream.available() > 0) {
                int i = fileInputStream.read();
                fileOutputStream.write(++i);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
