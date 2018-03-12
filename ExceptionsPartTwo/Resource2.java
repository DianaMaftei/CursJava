public class Resource2 implements AutoCloseable
{
    Resource1 resource;
    
    Resource2(Resource1 r1) {
        resource = r1;
    }
    
    public void close(){
        // 
    }
}
