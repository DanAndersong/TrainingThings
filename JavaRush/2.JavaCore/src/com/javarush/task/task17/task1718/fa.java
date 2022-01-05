package com.javarush.task.task17.task1718;

public class fa {
    private static fa ourInstance = new fa();

    public static fa getInstance() {
        return ourInstance;
    }

    private fa() {
    }
}
