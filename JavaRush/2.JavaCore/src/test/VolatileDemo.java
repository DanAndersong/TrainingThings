package test;

/*
Выражаемся покороче
*/

import com.javarush.task.task16.task1631.common.ImageReader;

import java.io.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;


public class VolatileDemo {

    public static void main(String[] args) {
        new VolatileDemo().start();
    }
    //----------------------------------------------

    volatile private boolean btExit = false; //попробуйте убрать volatile

    // запуск потоков
    public void start() {
        new Thread(gui).start();
        System.out.println("gui thread started");
        new Thread(game).start();
        System.out.println("game thread started");
    }

    // поток для интерфейса
    Runnable gui = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000); // типа пользователь общается с GUI и выходит из игры
            } catch (InterruptedException ignored) {}
            btExit = true; // поток game не видит это изменение без volatile
            System.out.println("gui thread finished");
        }
    };

    // поток для игры
    Runnable game = new Runnable() {
        @Override
        public void run() {
            while (!btExit) {
                // без volatile этот цикл крутится бесконечно
            }
            System.out.println("game thread finished");
        }
    };
}


