package nine;

/**
 *
 * @author user
 */
public class B {
    int i = 0;
    int b;
    static int count;
    
    B(){
        count++;
        this.count++;
        B.count++;
    }
    
    static void changeCount (B ba) {
        B.count++;
        count++;
        
    }
    
    void changeCount (int b) {
        this.count++;
    }
    
    public static void main(String[] args) {
        
    }
}
