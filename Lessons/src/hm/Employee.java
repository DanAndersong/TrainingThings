package hm;

public class Employee {
    private static int employeeIDs;
    
    private int id;
    public String surname;
    private int age;
    private double salary;
    private String department;

    Employee(String surname, int age, double salary, String department) {
        this(salary,department);
        setNewId();
        this.surname = surname;
        this.age = age;
    }
    
    private void setNewId() {
        this.id = ++employeeIDs;
    }
    
    public Employee(String surname, int age) {
        setNewId();
        this.surname = surname;
        this.age = age;
    }

    private Employee(double salary, String department) {
        this.salary = salary;
        this.department = department;
        setNewId();
    }
    
    public void multiplySalary(int x) {
        salary *= x;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", surname=" + surname + ", age=" + age + ", salary=" + salary + ", department=" + department + '}';
    }
           
}
