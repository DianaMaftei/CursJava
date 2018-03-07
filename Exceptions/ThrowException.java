import java.io.*;
import java.sql.*;

public class ThrowException
{
    
   public static void main(String... dogs) throws Exception {
       
       throwsMethod();
    
   }
   
   public static void throwsMethod() throws FileNotFoundException, SQLException {
       //FileReader fr = new FileReader("myfile.txt");
       throw new FileNotFoundException();
   }

    
}
