package com.javarush.task.task08.task0824;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //специально без конструкторов, потренировать пальцы

        Human gFather = new Human();
        gFather.name = "gFather";
        gFather.age = 70;
        gFather.sex = true;

        Human gFather1 = new Human();
        gFather1.name = "gFather1";
        gFather1.age = 70;
        gFather1.sex = true;

        Human gMother = new Human();
        gMother.name = "gMother";
        gMother.age = 70;
        gMother.sex = false;

        Human gMother1 = new Human();
        gMother1.age = 70;
        gMother1.name = "gMother1";
        gMother1.sex = false;

        Human father = new Human();
        father.age = 40;
        father.name = "Father";
        father.sex = true;

        Human mother = new Human();
        mother.age = 40;
        mother.name = "Mother";
        mother.sex = false;

        Human child1 = new Human();
        child1.age = 10;
        child1.name = "Child1";
        child1.sex = false;

        Human child2 = new Human();
        child2.age = 11;
        child2.name = "Child2";
        child2.sex = true;

        Human child3 = new Human();
        child3.age = 12;
        child3.name = "Child3";
        child3.sex = true;

        gFather.children.add(father);
        gMother.children.add(father);
        gFather1.children.add(mother);
        gMother1.children.add(mother);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        System.out.println(gFather);
        System.out.println(gFather1);
        System.out.println(gMother);
        System.out.println(gMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
