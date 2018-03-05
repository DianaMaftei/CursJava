import java.util.Arrays;
import java.util.Comparator;

public class Sorting
{
    public static void main(String[] args) {
        
        String[] fruits = new String[]{"apple", "pear", "watermelon", "pineapple", "cherry"};
        
        Arrays.sort(fruits);
        
        System.out.println(Arrays.toString(fruits));
        
        Arrays.sort(fruits, new Comparator() {
            @Override
            public int compare(Object one, Object two) {
                return ((String)one).length() - ((String)two).length();
            }
        }
        );
        
        System.out.println(Arrays.toString(fruits));
        
        Arrays.sort(fruits, (fruit1, fruit2) -> {return fruit2.length() - fruit1.length();});
        Arrays.sort(fruits, (String fruit1, String fruit2) -> {return fruit2.length() - fruit1.length();});
        // Arrays.sort(fruits, (String fruit1, fruit2) -> {return fruit2.length() - fruit1.length();});        
        
        System.out.println(Arrays.toString(fruits));
    
    }
}
