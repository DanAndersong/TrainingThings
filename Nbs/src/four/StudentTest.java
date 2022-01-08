package four;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("name","surname",1);
        Student student2 = new Student("name","surname",1,2,3,4);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        
    }
    
     
    static void getAvgGrade (Student student) {
        int sum;
        
        sum =   student.getMathGrade()+
                student.getEconomicsGrade()+
                student.getForeignGrade();
        
        System.out.println(sum / 3d);
    }
}

class Student {
    private String name;
    private String surName;
    private int mathGrade;
    private int economicsGrade;
    private int foreignGrade;
    
    int course;

    public Student(String name, String surName, int course, int mathGrade, int economicsGrade, int foreignGrade) {
        this(name,surName,course);       
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignGrade = foreignGrade;
    }

    public Student(String name, String surName, int course) {
        this.name = name;
        this.surName = surName;
        this.course = course;
    }

    public Student() {
        
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getEconomicsGrade() {
        return economicsGrade;
    }

    public int getForeignGrade() {
        return foreignGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEconomicsGrade(int economicsGrade) {
        this.economicsGrade = economicsGrade;
    }

    public void setForeignGrade(int foreignGrade) {
        this.foreignGrade = foreignGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    private boolean isNumeric(String spl) {
        try {
            double d = Double.valueOf(spl);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

//    private int getAvg(String grade) {
//        String[] spls = grade.split("");
//        int sum = 0;
//        int count = 0;
//        
//        for (int i = 0; i < spls.length; i++) {
//            if (isNumeric(spls[i])) {
//                sum += Integer.valueOf(spls[i]);
//                count++;
//            }
//        }
//        return sum / count;
//    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surName=" + surName + ", mathGrade=" + mathGrade + ", economicsGrade=" + economicsGrade + ", foreignGrade=" + foreignGrade + ", course=" + course + '}';
    }
}