import java.time.Year;
import java.time.YearMonth;
import java.util.Date;

public class thirteen {
    public static void main(String[] args) {

    daysOfMounth(1);
    }

    static void daysOfMounth (int mounth) {
        System.out.println(YearMonth.of(YearMonth.now().getYear(), mounth).lengthOfMonth());
    }
    }
}
