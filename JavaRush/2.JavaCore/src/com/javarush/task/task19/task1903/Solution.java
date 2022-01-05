package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static
    {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
//        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeData() {
//            @Override
//            public String getCountryCode() {
//                return "CA";
//            }
//
//            @Override
//            public String getCompany() {
//                return "AA Inc.";
//            }
//
//            @Override
//            public String getContactFirstName() {
//                return "Hono";
//            }
//
//            @Override
//            public String getContactLastName() {
//                return "Niso";
//            }
//
//            @Override
//            public int getCountryPhoneCode() {
//                return 42;
//            }
//
//            @Override
//            public int getPhoneNumber() {
//                return 55534355;
//            }
//        });
//
//        System.out.println(incomeDataAdapter.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return String.format("%s, %s",data.getContactLastName(),data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String number = String.valueOf(data.getPhoneNumber());

            while (number.length() < 10) {
                number = String.format("0%s",number);
            }

            return String.format("+%s(%s)%s-%s-%s",
                    data.getCountryPhoneCode(),
                    number.substring(0,3),
                    number.substring(3,6),
                    number.substring(6,8),
                    number.substring(8,10));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}