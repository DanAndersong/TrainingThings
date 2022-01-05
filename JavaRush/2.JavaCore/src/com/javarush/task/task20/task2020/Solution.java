package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        public String toString(){
            String s = greeting +"I am " + firstName + " " + lastName +" I from " +
                    country + ". I am a " + sex;
            return s;
        }
    }

    enum Sex implements Serializable {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2020/file"));
        Person person = new Person("Kep","Aron", "Kanada", Sex.MALE);
        System.out.println(person);
        oos.writeObject(person);
        oos.close();

        FileInputStream fileInputStream = new FileInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2020/file");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        Person person1 = (Person) object;
        System.out.println(person1);
    }
}
