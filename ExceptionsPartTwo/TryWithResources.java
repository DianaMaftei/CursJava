public class TryWithResources
{
    public static void main(String[] args) {
        try(Resource1 r1 = new Resource1(); Resource2 r2 = new Resource2(r1);) {
            // 
            
        } 
    }
}
