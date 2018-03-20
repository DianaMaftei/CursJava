import java.time.*;

public class LocalTimeTest
{
   public static void main(String[] args) {
      LocalTime lt = LocalTime.now(); 
      System.out.println(lt);
      
      LocalTime lt1 = LocalTime.of(9,40);
      LocalTime lt2 = LocalTime.of(9,40, 35);
      LocalTime lt3 = LocalTime.of(9,40, 35, 8732);
      
      System.out.println(lt1);
      System.out.println(lt2);
      System.out.println(lt3);
      
      //LocalTime lt4 = LocalTime.of(19,70, 35, 8732);
      //System.out.println(lt4);
      
      LocalTime lt5 = LocalTime.parse("09:40:35");
      System.out.println(lt5);
      
      System.out.println(LocalTime.MIN);
      System.out.println(LocalTime.MAX);
      
      System.out.println(lt5.getHour());
      
      System.out.println(lt5.plusHours(5));

   }
}
