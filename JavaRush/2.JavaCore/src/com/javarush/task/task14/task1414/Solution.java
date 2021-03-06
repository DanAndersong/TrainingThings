package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        String[] keys = {"cartoon", "thriller", "soapOpera"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s = reader.readLine();
            MovieFactory.getMovie(s);

            if (!Arrays.asList(keys).contains(s)) break;
        }


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
                System.out.println(movie.getClass().getSimpleName());
            }
            //напишите тут ваш код, пункты 5,6

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
                System.out.println(movie.getClass().getSimpleName());
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
                System.out.println(movie.getClass().getSimpleName());
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }


    //Напишите тут ваши классы, пункт 3
}
