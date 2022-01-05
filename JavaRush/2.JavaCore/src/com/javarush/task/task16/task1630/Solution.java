package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    private static String firstFileName;
    private static String secondFileName;

    static
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        }catch (Exception e){ }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String result = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }
        @Override
        public String getFileContent() {
            return result;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String line;
                while ((line = reader.readLine()) != null){
                    result += line + " ";
                }
                reader.close();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //add your code here - добавьте код тут
}
