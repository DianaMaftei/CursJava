public class ErrorsTest
{
    static {
        ///String s = null;
        //s.length();
        
        outOfMemory();
    }
    
    public static void main(String[] args) {
            //recursive(1);
            //outOfMemory();
    }
    
    
    public static void recursive(int i) {
        recursive(i + 1);
    }
    
    public static void outOfMemory() {
        int dummyArraySize = 15;
        long[] memoryAllocated = null;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            memoryAllocated = new long[dummyArraySize];
            dummyArraySize *= dummyArraySize * 2;
        }
    }
}
