package four;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.economicsGrade = 1;
        student1.foreignGrade= 1;
        student2.economicsGrade = 2;
        student2.foreignGrade= 2;
        student3.economicsGrade = 3;
        student3.foreignGrade= 3;
        
        getAvgGrade(student1);
        
    }
    
     
    static void getAvgGrade (Student student) {
        int sum;
        
        sum =   student.mathGrade+
                student.economicsGrade+
                student.foreignGrade;
        
        System.out.println(sum / 3d);
    }
}

class Student {
    String name;
    String surName;
    int mathGrade;
    int economicsGrade;
    int foreignGrade;
    
    int course;
    
   

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
}