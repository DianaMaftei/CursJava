import java.time.*;

public class LocalDateTest
{
   public static void main(String[] args) {
       LocalDate ld = LocalDate.now();
       System.out.println(ld);
       
       LocalDate ld1 = LocalDate.of(2015, Month.JANUARY, 1);
       System.out.println(ld1);
       
       // LocalDate ld2 = new LocalDate();
       
       //LocalDate ld3 = LocalDate.parse("2016-3-1");
       //System.out.println(ld3);
       
       LocalDate ld4 = LocalDate.parse("2016-03-01");
       System.out.println(ld4);
       
       Month m = ld4.getMonth();
       int month = ld4.getMonthValue();
       
       System.out.println(m);
       System.out.println(month);
       
       System.out.println(ld.getDayOfWeek());
       
       LocalDate first = LocalDate.parse("2017-03-21");
       LocalDate last = LocalDate.parse("2017-03-23");
       
       System.out.println(first.isBefore(last));
       System.out.println(first.isAfter(last));
       
       //first = first.plusDays(2);
       //first = first.plusDays(-2);
       System.out.println(first);
       
       //System.out.println(first.isBefore(last));
       //System.out.println(first.isAfter(last));
       
       first = first.withMonth(12);
       
       System.out.println(first);
       
       LocalDate feb29 = LocalDate.parse("2016-02-29");
       feb29 = feb29.plusDays(1);

       System.out.println(feb29);
       
       System.out.println(LocalDate.of(2017, 02, 30));;
    }
}
