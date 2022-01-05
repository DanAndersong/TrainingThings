package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder stringBuilder = new StringBuilder();

        while (bufferedReader.ready()){
            stringBuilder.append(bufferedReader.readLine());
        }

        Document document = Jsoup.parse(stringBuilder.toString(), "", Parser.xmlParser());
        Elements elements = document.select(args[0]);

        for (Element element : elements){
            System.out.println(element);
        }
        reader.close();
        bufferedReader.close();
    }
}
