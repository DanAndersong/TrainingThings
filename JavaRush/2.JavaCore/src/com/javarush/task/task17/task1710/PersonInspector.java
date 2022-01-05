package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonInspector {
    static private Set<String>commandList = new HashSet<>();

    static
    {
        commandList.add("-c");//create
        commandList.add("-u");//update
        commandList.add("-d");//remove/delete
        commandList.add("-i");//info
    }


    public void analyze(String data) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        String[] args = data.split("\\s");

        if (commandList.contains(args[0])) {
            String command = args[0];

            if (command.equals("-c") || command.equals("-u")) {
                Date date;
                date = simpleDateFormat.parse(args[args.length-1]);

                String name = getName(data);
                String sex = getSex(data);
                if (command.equals("-c")) create(name, sex, date);
                if (command.equals("-u")) update(args[1], name, sex, date);
            }
            if (command.equals("-d")) remove(args[1]);
            if (command.equals("-i")) info(args[1]);
        }
    }

//=================LOGIC

    private void create(String name, String sex, Date date) {
        if (sex.equals("ж")) Solution.allPeople.add(Person.createFemale(name, date));
        if (sex.equals("м")) Solution.allPeople.add(Person.createMale  (name, date));
        System.out.println(Solution.allPeople.size()-1);
    }

    private void update(String index, String name, String sex, Date date) {
        Person person = Solution.allPeople.get(Integer.parseInt(index));
        person.setName(name);
        person.setBirthDate(date);
        if (sex.equals("м")) person.setSex(Sex.MALE);
        if (sex.equals("ж")) person.setSex(Sex.FEMALE);
    }

    private void remove(String index) {
        Person person = Solution.allPeople.get(Integer.parseInt(index));
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    private void info(String index) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = Solution.allPeople.get(Integer.parseInt(index));
        //name
        System.out.print(person.getName());
        //sex
        if (person.getSex() == Sex.MALE) System.out.print(" м ");
        if (person.getSex() == Sex.FEMALE) System.out.print(" ж ");
        //date
        System.out.println(dateFormat.format(person.getBirthDate()));
    }

    private String getName (String str) {
        String name = "";
        Pattern patternName = Pattern.compile("[А-Я].+[^мж[0-9]/ ]");

        Matcher matcher = patternName.matcher(str);
        while (matcher.find()) name = (str.substring(matcher.start(), matcher.end()));
        return name;
    }

    private String getSex (String str) {
        String sex = "";
        Pattern patternSex = Pattern.compile(" [м|ж] ");
        Matcher matcher = patternSex.matcher(str);

        while (matcher.find()) sex = (str.substring(matcher.start(), matcher.end()));

        return sex.replaceAll("\\s", "");
    }
}
