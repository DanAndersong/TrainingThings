import java.util.ArrayList;

public class Service {
    ArrayList<Car> cars;
    ArrayList<Employee> employees;

    public Service() {
        this.cars = new ArrayList<Car>();
        this.employees = new ArrayList<Employee>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
