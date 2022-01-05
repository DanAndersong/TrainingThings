package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        FileInputStream fileInputStream;

        while (true) {
            fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
