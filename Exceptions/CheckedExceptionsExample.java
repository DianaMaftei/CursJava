import java.io.*;
public class CheckedExceptionsExample
{
   public static void main(String... stars) {
       try {
           //FileReader fr = new FileReader("myfile.txt");
           
           
           //try to close file
           System.out.println(0);
           
           //System.exit(0);
           String s = null;
           s.length();
           System.out.println(1);
           
       } 
       //{
           //sout
       // }
       //catch(FileNotFoundException e) {
           // do somthing if file does not exist
           //throw new Exception();
           
        //} 
        catch (Exception e) {
           // do something
           System.out.println(2);
       } 
       finally {
           // try to close resource
           System.out.println(3);
       }
       
    }
}
