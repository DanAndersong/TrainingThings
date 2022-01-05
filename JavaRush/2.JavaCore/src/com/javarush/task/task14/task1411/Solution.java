package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> keys = new HashSet<>();
        HashSet<Person> users = new HashSet<>();
        String[] arg = {"user","loser","proger","coder"};

        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true){
            key = reader.readLine();
            if (!Arrays.asList(arg).contains(key)) break;
            keys.add(key);
        }

        for (String s: keys) {
            switch (s) {
                case "proger": Person proger = new Person.Proger(); { users.add(proger); break; }
                case "coder":  Person coder  = new Person.Coder();  { users.add(coder);  break; }
                case "loser":  Person loser  = new Person.Loser();  { users.add(loser);  break; }
                case "user":   Person user   = new Person.User();   { users.add(user); }
            }
        }
        users.forEach(Solution::doWork);
    }

    public static void doWork(Person person) {

        if (person instanceof Person.Loser)  ((Person.Loser)  person).doNothing();
        if (person instanceof Person.Coder)  ((Person.Coder)  person).writeCode();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
        if (person instanceof Person.User)   ((Person.User)   person).live();
    }
}
