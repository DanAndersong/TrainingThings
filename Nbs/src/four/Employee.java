package four;

/**
 *
 * @author user
 */
public class Employee {
    private static int employeeID = 0;
    
    private int id;
    private String surname;
    private int age;
    private double salary;
    private String department;

    public Employee(String surname, int age, double salary, String department) {
        employeeID++;
        this.id = employeeID;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    
    
    public void multiplySalary(int x) {
        salary *= x;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", surname=" + surname + ", age=" + age + ", salary=" + salary + ", department=" + department + '}';
    }
    
    
    
           
}
