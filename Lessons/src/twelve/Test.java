package twelve;



public class Test {
    public static void main(String[] args) {
        Student one = new Student(1,1,"f","f");
        Student two = new Student(1,1,"f","f");
        Test.eq(one,two);
        Test.eq2(one,two);
    }

    static void eq(Student student, Student student2) {
        System.out.println(student.equals(student2));
    }

    static void eq2(Student student, Student student2) {

        if (student.surname.equals(student2.surname)) {
            if (student.name.equals(student2.name)) {
                if (student.grade == student2.grade) {
                    if (student.id == student2.id) {
                        if (student.age == student2.age) {
                            System.out.println("студенты равны");
                        } else {
                            System.out.println("не совпадает возраст");
                        }
                    } else {
                        System.out.println("не совпадает айди");
                    }
                } else {
                    System.out.println("не совпадает оценка");
                }
            } else {
                System.out.println("не совпадает имя");
            }
        } else {
            System.out.println("не совпадает фамилия");
        }

    }
}

class Student {
    static int countId = 0;
    String name;
    String surname;
    int age;
    int grade;
    int id;

    public Student(int age, int grade, String name, String surname) {
        this.id = ++countId;
        this.age = age;
        this.grade = grade;
        this.surname = surname;
        this.name = name;
    }
}
