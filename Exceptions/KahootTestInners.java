//pt a testa unul din exercitiile din kahoot
class A {void m() {System.out.println("outer");}} 

public class KahootTestInners
{
    public static void main(String[] args) {
        new KahootTestInners().go();
    }
    
    void go() {

        class A {void m() {System.out.println("inner");}}
        new A().m();
    } 
    
    class A {void m() {System.out.println("middle");}}
}
