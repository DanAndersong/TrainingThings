package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top, left, width, height;

    public void initialize (int width, int height){
        this.width = width;
        this.height = height;
    }
    public void initialize (int top){
        this.top = top;
    }
    public void initialize (int width, int height, int top){
        this.width = width;
        this.height = height;
        this.top = top;
    }
    public void initialize (int width, int height, int top, int left){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public static void main(String[] args) {

    }
}
