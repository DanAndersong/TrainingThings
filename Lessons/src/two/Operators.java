
package two;

public class Operators {
    public static void test() {
        int k = 1;
        boolean a = ++k > 5 && k++ < 3 ^ 3 > 2;
        
        System.out.println(a);
        System.out.println(k);
        
    }
    
    public static void task() {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;  //1.3  2  3.3 - 20 = -16.7
        System.out.println(result);
        
        
        int a = 5, b = 8;
        //   5  -   3 + 4 + 4 + 5 = 15
        a = a-- - --a+ ++a+a++ +a;//  
        System.out.println("a = " + a);
        //  9 + 9 + 11 - 10 = 19
        b = ++b + b++ + ++b - --b;
        System.out.println("b = " + b);
    } 
}
