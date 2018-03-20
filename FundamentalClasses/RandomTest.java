import java.util.Random;

public class RandomTest
{
    public static void main(String...args) {
        Random random = new Random();
        
        //Min + (int)(Math.random() * ((Max - Min) + 1))
        int i = 5 + (int) (Math.random() * ((10 - 5) + 1));
        
        System.out.println(i);
    }
}
