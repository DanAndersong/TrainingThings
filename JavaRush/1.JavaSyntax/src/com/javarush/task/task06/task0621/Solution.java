package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gFatherName = reader.readLine();
        Cat gCatFather = new Cat(gFatherName);

        String gMotherName = reader.readLine();
        Cat gCatMother = new Cat(gMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, gCatFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, gCatMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(gCatFather);
        System.out.println(gCatMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

//        Cat(String name, Cat mother, boolean nobody) { // nobody - это костыль для избежания неоднозначности
//            this.name = name;                          // в определении конструкторов. Anderson Dan
//            this.mother = mother;
//        }
//
//        Cat(String name, Cat father) {
//            this.name = name;
//            this.father = father;
//        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, " + "father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
