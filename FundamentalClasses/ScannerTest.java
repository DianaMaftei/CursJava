import java.util.Scanner;

public class ScannerTest
{
    public static void main(String...args) {
        
        System.out.println("What is your name?");
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        System.out.println("Hello " + name); 
        
        System.out.println("How old are you?");
        
        int age = sc.nextInt();
        
        System.out.printf("You are %d years old", age);
        
    }
}
