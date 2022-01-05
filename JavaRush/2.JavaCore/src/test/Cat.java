package test;


import com.javarush.task.task19.task1904.Person;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cat implements Serializable {
    private int id;
    private String name;

    public Cat() {

    }
    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString(){
        return id + " : " + name;
    }

    public static void main(String[] argvssd) throws ParseException, IOException, InterruptedException {
        Cat cat = new Cat();
        cat.setId(1);
        cat.setName("X");
        System.out.println(cat.toString());
    }

}
