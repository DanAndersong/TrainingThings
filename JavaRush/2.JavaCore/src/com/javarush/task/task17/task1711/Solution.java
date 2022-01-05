package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
*/

public class Solution {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, args);
        list.remove(0);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    create(list);
                    break;
            }
            case "-u":
                synchronized (allPeople) {
                    update(list);
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    delete(list);
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    info(list);
                    break;
                }
        }
    }

    public static void create(ArrayList<String> list) throws ParseException {
        String name;
        Date date;
        Person person;

//        while (0 != list.size()) {
        while (!list.isEmpty()) {
            date = simpleDateFormat.parse(list.get(2));
            name = list.get(0);
            person = list.get(1).equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
            for (int i = 0; i < 3; i++) list.remove(0);
        }
    }

    public static void update(ArrayList<String> list) throws ParseException {
        String name;
        Date date;
        Sex sex;

        while (!list.isEmpty()) {
            date = simpleDateFormat.parse(list.get(3));
            name = list.get(1);
            sex = list.get(2).equals("м") ? Sex.MALE : Sex.FEMALE;
            Person person = allPeople.get(Integer.parseInt(list.get(0)));

            person.setName(name);
            person.setBirthDate(date);
            person.setSex(sex);
            for (int i = 0; i < 4; i++) list.remove(0);
        }
    }

    public static void delete(ArrayList<String> list) {
        Person person;

        for (String s : list) {
            person = allPeople.get(Integer.parseInt(s));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static void info(ArrayList<String> list) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person;
        String sex;

        for (String s : list) {
            person = allPeople.get(Integer.parseInt(s));
            sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";

            System.out.println(person.getName() + " " + sex + " " +
                    simpleDateFormat.format(person.getBirthDate()));
        }
    }
}
