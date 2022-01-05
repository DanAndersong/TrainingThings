package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top, left, width, height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(int width, int height, int left){
        this.height = height;
        this.width = width;
        this.left = left;
    }
    public Rectangle(int width, int height, int left, int top){
        this.height = height;
        this.width = width;
        this.left = left;
        this.top = top;
    }
    public Rectangle(int top){
        this.top = top;
    }

    public static void main(String[] args) {

    }
}
