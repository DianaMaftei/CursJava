public class SystemTest
{
    public static void main(String...args) {
        System.out.printf("diana are %d %s", 3, "pere");

        //System.exit(1);
        
        System.gc();
        
        //System.err.println("Error");
        
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            int x = 2 + i;
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println(start);
        System.out.println(end);
        System.out.println(end- start);        
    }
}
