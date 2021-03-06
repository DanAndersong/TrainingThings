package com.javarush.task.task09.task0906;
import javax.swing.JButton;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
//        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
//        String className = Thread.currentThread().getStackTrace()[2].getClassName();
//        System.out.println(className + ": " + methodName + ": " + s);
        Solution solution = new Solution();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(solution.getClass().getName() + ": " + stackTraceElements[2].getMethodName() + ": " + s);
    }
}
