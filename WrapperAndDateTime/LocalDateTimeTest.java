import java.time.*;

public class LocalDateTimeTest
{
    public static void main(String[] args) {
        
        LocalDateTime ldt = LocalDateTime.of(2017, 3, 15, 9, 51);
    
        LocalDate ld = LocalDate.of(2017, 3, 15);
        LocalTime lt = LocalTime.of(9, 51);
        
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
    
        System.out.println(ldt);
        System.out.println(ldt2);
        
        LocalDateTime ldt3 = ld.atTime(lt);
        LocalDateTime ldt4 = lt.atDate(ld);
        
        
    }
}
