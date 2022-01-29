package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    int i;
    String developer;

    public Skyscraper(int i) {
        this.i = i;
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + i);
    }

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);

    }

    public Skyscraper(String developer) {
        //this.developer = developer;
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);

    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

