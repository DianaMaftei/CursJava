import java.time.*;

public class PeriodExample
{
    public static void main(String[] args) {
    LocalDate ld = LocalDate.of(2018, 1, 15);
    
    Period p = Period.ofMonths(1);
    

    for(int i = 1; i <= 12; i++) {
        System.out.printf("Azi %s %d %s imi iau banii", ld.getDayOfWeek(), ld.getDayOfMonth(), ld.getMonth());
        System.out.println();
        ld = ld.plus(p);
    }
    
    }
    
}
