import java.util.*;

class GenericContainerTest {
    public static void main(String[] stuff) {
        GenericContainer<Object, Integer> gce = new GenericContainer<>();
        gce.packContainer(new Elephant());
        //gce.packContainer(new Book());
        
        Integer i = 10;
        Long l = 20l;
        //gce.packContainer(i);
        //gce.packContainer(l);
       
        GenericContainer g = new GenericContainer(); // raw type
        g.packContainer(new Elephant());
        g.packContainer(new Book()); 
        
        GenericContainer<Elephant, Integer> f = new GenericContainer<>(); 
        
        //System.out.println(gce instanceof GenericContainer<Object, Integer>);
        
        System.out.println(gce.emptyContainer());
        
        GenericContainer<?, ?> h = new GenericContainer<>(); 
        
        
    }
    
    public static void overload(GenericContainer<Object, Integer> g) {
    }
    
    //public static void overload(GenericContainer<Object, Number> g) {
    //}
}