package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String[] urls = {
                "https://javarush.ru",
                "https://google.com",
                "http://wikipedia.org",
                "facebook.com",
                "https://instagram",
                "codegym.cc"
        };

        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - "
                    + url
                    + ", сетевой протокол - "
                    + protocol
                    + ", домен - "
                    + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http")) {
            return "http";
        } else if (url.startsWith("https")) {
            return "https";
        } else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        String[] domains = {"com","net","org","ru"};
        String resultDomain = "неизвестный";
        int dot = url.lastIndexOf(".");

        if (dot > -1) {
            String domain = url.substring(dot + 1);

            for (int i = 0; i < domains.length; i++) {
                if (domains[i].equals(domain)) {
                    resultDomain = domain;
                    break;
                }
            }
        }
        return resultDomain;

    }
}
