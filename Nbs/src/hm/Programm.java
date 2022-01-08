package hm;


public class Programm {
    public static void main(String[] args) {
        Employee employee1 = new Employee("1", 20, 1000, "D1");
        Employee employee2 = new Employee("2", 21, 1100, "D1");
        
        employee2.multiplySalary(2);
        employee1.multiplySalary(22);
        System.out.println(employee2.toString());
        System.out.println(employee1.toString());
    }
}
