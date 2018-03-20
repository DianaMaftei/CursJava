public class GenericMethod {
    
    public static <T> T printStuff(T t) {
        return t;
    }
    
    public static <U> void printMoreStuff(U u) {
        System.out.println(u);
    }
}
