package four;

/**
 *
 * @author user
 */
public class BankAccount {
    private int id;
    private double balance;
    
    public void refill(double sum) {
        balance += sum;
    }
    
    public void withdrawing(double sum){
        balance -= sum;

    }
}
