public interface InterfaceWithInnerClass {
    
    int j = 3;
    
    class Inner { // putem avea clase inner intr-o interfata, ele vor fi publice si statice dar nu si final
        
        
    }
    
    class Inner2 extends Inner {
    }
    
}
