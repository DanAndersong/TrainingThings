package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gFather1 = new Human("gFather1", true, 70);
        Human gFather2 = new Human("gFather2", true, 80);

        Human gMother1= new Human("gMother1", false, 70);
        Human gMother2= new Human("gMother2", false, 80);

        Human father = new Human("Father", true, 40, gFather1, gMother1);
        Human mother = new Human("Mother", false, 40, gFather2, gMother2);

        Human son = new Human("Son", true, 17, father, mother);
        Human dother = new Human("Dother", false, 15, father, mother);
        Human dother2 = new Human("Dother2", false, 8, father, mother);

        System.out.println(gFather1);
        System.out.println(gFather2);
        System.out.println(gMother1);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(dother);
        System.out.println(dother2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}