package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            if (args[0].equals("-c")) {
                //        System.setIn(new ByteArrayInputStream("/Users/user/Googledrive/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1827/text".getBytes()));
                String file = new Scanner(System.in).nextLine();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                List<Integer> allID = new ArrayList<>();

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    allID.add(Integer.parseInt(line.substring(0, 8).replaceAll(" ", "")));
                }

                int maxID = allID.get(0);

                for (int i = 0; i < allID.size(); i++) {
                    int id = allID.get(i);
                    if (id > maxID){
                        maxID = id;
                    }
                }
                bufferedReader.close();

                //-c productName price quantity
                // BEGIN
                String newID = format(String.valueOf(++maxID));
                String productName = productNameFormat(args[1]);
                String price = format(args[2]);
                String quantity = formatQuantity(args[3]);
                String newStr = "\n" + newID + productName + price + quantity;

                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(newStr.getBytes());

                fileOutputStream.close();
            }
        }
    }

    public static String productNameFormat(String s) {
        String name = s;

        if (name.length() > 30) {
            name = name.substring(0, 30);
        }else {
            while (name.length() < 30) {
                name += " ";
            }
        }
        return name;
    }

    public static String format(String s) {
        String format = s;

        if (format.length() > 8) {
            format = format.substring(0, 8);
        }else {
            while (format.length() < 8) {
                format += " ";
            }
        }
        return format;
    }

    public static String formatQuantity(String s) {
        String quantity = s;

        if (quantity.length() > 4) {
            quantity = quantity.substring(0, 4);
        }else {
            while (quantity.length() < 4) {
                quantity += " ";
            }
        }
        return quantity;
    }

}
