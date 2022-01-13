package seven.one;

import seven.two.Employee;

/**
 *
 * @author user
 */
public class Auditor extends Employee{
    String name;

    public Auditor(int id, int department) {
        super(id, department);
        department = 1;
    }

    public Auditor() {
    }
    
    
    
}
