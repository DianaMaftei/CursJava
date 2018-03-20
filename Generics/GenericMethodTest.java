
public class GenericMethodTest
{
    public static void main(String... stars) {
        GenericMethod g = new GenericMethod();
        
        g.printMoreStuff(new Integer(3));
        g.printMoreStuff(new Book());
        g.printMoreStuff(new Elephant());
    }
}
