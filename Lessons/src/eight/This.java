package eight;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class This {
    final static double PI = 3.14;
    
    
    static double area(double r) {
        return PI * r * r;
    }
    
    
    double circumference(double r) {
        return 2 * PI * r;
    }
    
    void info(double r) {
        System.out.println("radius " + r);
        System.out.println("area " + area(r));
        System.out.println("circumference " + circumference(r));
    }
    
    static int division (byte i, byte d, byte b){
        return i*d*b;
    }
    

    static void division(int i, int t) {
        try {
            System.out.println(i / t);
            System.out.println(i % t);
        } catch (ArithmeticException e) {
            System.out.println("division by zero error");
        }
        
    }
}

class F {
    public static void main(String[] args) {
        new This().info(100);

        
    
    }
}
