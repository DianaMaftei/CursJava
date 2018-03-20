public class TryWithResourcesTest
{
    public static void main(String...args) {
    
        try (Resource1 res1 = new Resource1(); Resource2 res2 = new Resource2()) {
            
            throw new NullPointerException();
            // res1
            // res2
        } 
    }
}

class Resource1 implements AutoCloseable {
    
    public void close(){
        System.out.println("close res1");
        throw new IllegalArgumentException();
    }
}

class Resource2 implements AutoCloseable {
    
    public void close(){
        System.out.println("close res2");
    }
}
