package com.javarush.task.task06.task0617;

public class Solution {
    public static class Idea {
        public String getDescription(){
            return "idea";
        }
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }
}
