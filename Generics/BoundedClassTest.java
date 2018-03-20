import java.util.*;

public class BoundedClassTest
{
    public static void main(String[] args) {
    // List
    // ArrayList
    
    List<?> listOne = new ArrayList<>(Arrays.asList(1, "Tralala", 3.4, true));
    
    List<? extends Number> listTwo = new ArrayList<>(Arrays.asList(1, 3.4, 4f, 8973498237498l));
    List<? super Number> listThree = new ArrayList<>(Arrays.asList(new Object()));
    
    System.out.println(listOne);
    System.out.println(listTwo);
    
    List<? extends Object> l  = new ArrayList<String>();
    l  = new ArrayList<Object>();
    
    List<? super Object> m  = new ArrayList<Object>();
    
    Object[] objs = new String[3];
    
    List<?> immutableListWithWildcard = new ArrayList<Number>(Arrays.asList(1, 3.4, 2));
    
    List<? super Integer> listFive = new ArrayList<>(Arrays.asList(123));
    
    List<? extends Number> immutableWithExtends  = new ArrayList<Integer>();
    
    
    //listOne.add(45);
    immutableWithExtends.add(2345l);
    listFive.add(213);
    
    }
}
