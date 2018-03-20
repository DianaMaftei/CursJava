import java.time.*;

public class PeriodTest
{
    public static void main(String[] args) {
        
        Period p = Period.ofDays(5);
        System.out.println(p);
        p = p.plusMonths(3);
        
        System.out.println(p);
        
        Period p1 = Period.ofDays(5).ofMonths(3);
        System.out.println(p1);
        
        LocalDate ld = LocalDate.of(2017, 3, 15);
        ld = ld.plus(p);
        System.out.println(ld);
        
        LocalTime lt = LocalTime.now();
        //lt.plus(p);
        
        Period p2 = Period.ofDays(-35);
        System.out.println(p2);
        
        //Period p3 = Period.parse("P5M3Y");
        Period p3 = Period.parse("p5y3m");
        System.out.println(p3);
        
        LocalDate start = LocalDate.of(2017, 9, 20);
        LocalDate current = LocalDate.now();
        
        System.out.println(Period.between(start, current));
        
        Period period = Period.ofMonths(1);
        System.out.println(period.minusDays(10));
        
    }
}
