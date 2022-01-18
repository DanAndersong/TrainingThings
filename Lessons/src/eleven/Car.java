package eleven;

public class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("blue","v2", 4);
        Car car2 = new Car("black","v6", 2);
        changeDoorCount(car1, 2);
        System.out.println(car1.doorCount);
        swapColor(car1,car2);
        System.out.println(car1.color);
        System.out.println(car2.color);


    }

    public static void changeDoorCount(Car car, int doors) {
        car.doorCount = doors;
    }
    public static void swapColor(Car car, Car car2) {
        String tmpColor = car.color;
        car.color = car2.color;
        car2.color = tmpColor;
    }
}