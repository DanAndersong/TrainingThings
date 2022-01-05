package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        String[] arrForChecks;
        String stringForCheks;

        if (telNumber == null || telNumber.equals("")){
            return false;
        }
//        letters check
        if (telNumber.replaceAll("[^A-zА-я]", "").length() > 0) {
            return false;
        }
//        brackets check
        arrForChecks = telNumber.replaceAll("[^)(]", "").split("");
        if (!arrForChecks[0].equals("")) {
            if (arrForChecks.length == 1 || arrForChecks.length > 2 ||
                    arrForChecks[0].equals(")") || telNumber.endsWith(")")) {
                return false;
            }
//        Check for numbers inside brackets
            if (telNumber.substring(telNumber.indexOf('(') + 1, telNumber.indexOf(')')).length() != 3) {
                return false;
            }
        }
//        dash check
        if (telNumber.contains("-")) {
            stringForCheks = telNumber.replaceAll("[^-]", "");

            if (stringForCheks.length() > 2 || telNumber.endsWith("-")) {
                return false;
            }
            if (stringForCheks.length() == 2) {
                if (telNumber.charAt(telNumber.indexOf("-")+1) == '-') {
                    return false;
                }
            }
//            Check for dash location
            if (telNumber.contains(")")) {
                if (telNumber.replaceAll("[^)-]","").charAt(3) != '-') {
                    return false;
                }
            }
        }
        if (telNumber.startsWith("+")) {
            if (telNumber.replaceAll("[^\\d]", "").length() == 12) {
                return true;
            }
        } else if (telNumber.startsWith("(") || isNumeric(telNumber.charAt(0))) {
            if (telNumber.replaceAll("[^\\d]", "").length() == 10) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumeric (char s) {
        try{
            double d = Double.parseDouble(String.valueOf(s));
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] numbers  = {
                "+380501234567",
                "+38(050)1234567",
                "+38050123-45-67",
                "+51321-3211113$",
                "050123-4567",
                "+38)050(1234567",
                "+38(050)1-23-45-6-7",
                "050ххх4567",
                "050123456",
                "(0)501234567",
                "(0501234567"
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " : " + checkTelNumber(numbers[i]));
        }
    }
}
