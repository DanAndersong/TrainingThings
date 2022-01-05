package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);

        System.out.println(hen.getCountOfEggsPerMonth());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case "Belarus": hen = new BelarusianHen();break;
                case "Ukraine": hen = new UkrainianHen();break;
                case "Moldova": hen = new MoldovanHen();break;
                case "Russia":  hen = new RussianHen();
            }
            return hen;
        }
    }
}
