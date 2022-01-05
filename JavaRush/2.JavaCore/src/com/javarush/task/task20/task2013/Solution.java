package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(mother);
            out.writeObject(father);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String)in.readObject();
            lastName = (String)in.readObject();
           setMother((Person)in.readObject());
           setFather((Person)in.readObject());
            age = in.readInt();
           setChildren((List<Person>) in.readObject());
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("a","b",25);
        person1.setFather(new Person("dad","dady",44));
        person1.setMother(new Person("mom","momy",46));

        List<Person> person1Child = new ArrayList<>();
        person1Child.add(new Person("douther","dody",7));
        person1Child.add(new Person("son","sony",3));
        person1.setChildren(person1Child);

        File outFile = new File("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2013/text");
        person1.writeExternal(new ObjectOutputStream(new FileOutputStream(outFile)));
        Person personLoad = new Person("nobody","nobody",0);
        personLoad.readExternal(new ObjectInputStream(new FileInputStream(outFile)));

        for (Person person : personLoad.children){
            System.out.println(person.firstName);
        }
    }
}
