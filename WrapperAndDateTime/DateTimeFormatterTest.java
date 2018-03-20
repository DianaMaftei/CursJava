import java.time.*;
import java.time.format.*;

public class DateTimeFormatterTest
{
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        
        DateTimeFormatter dtf0 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        
        DateTimeFormatter dtf4 = DateTimeFormatter.BASIC_ISO_DATE;
        //BASIC_ISO_DATE
        
        //ofPattern
        
        LocalDateTime ldt = LocalDateTime.now();
        
        DateTimeFormatter dtf5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        //System.out.println(ld.format(dtf5));
        
        DateTimeFormatter dtf6 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //System.out.println(ld.format(dtf6));
        
        //System.out.println(ldt.format(dtf5));
        //System.out.println(ldt.format(dtf6));
        
        //System.out.println(ld.format(dtf0));
        //System.out.println(dtf0.format(ld));
        
        //System.out.println(ld.format(dtf1));
        //System.out.println(ld.format(dtf2));
        //System.out.println(ld.format(dtf3));
        
        //System.out.println(ld.format(dtf4));
        
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("yy 'd' MM dd");
        
        LocalTime lt = LocalTime.now();
        
        System.out.println(ldt.format(dtf7));
        //System.out.println(lt.format(dtf7));
        
             
    }
}
