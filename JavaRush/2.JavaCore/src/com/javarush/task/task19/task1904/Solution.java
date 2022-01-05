package com.javarush.task.task19.task1904;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        String file = "/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1904/text";
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(new FileReader(file)));
        System.out.println(personScannerAdapter.read());
        System.out.println(personScannerAdapter.read());
    }

    public static class PersonScannerAdapter implements PersonScanner {
    private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() {
            String[] args = fileScanner.nextLine().split(" ");
            Date date = null;
            try {
                date = new SimpleDateFormat("ddMMyyyy").parse(args[3] + args[4] + args[5]);
            }catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(args[1],args[2],args[0],date);
        }

        @Override
        public void close() {
            fileScanner.close();
        }
    }
}
