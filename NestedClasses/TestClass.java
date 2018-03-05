class TestClass {

    public static void main (String[] args) {
        OuterMember outerMember = new OuterMember();
        OuterMember.InnerMember innerMember = outerMember.new InnerMember();
        innerMember.access();
        
        OuterLocal outerLocal = new OuterLocal();
        outerLocal.access();
        
        InheritInnerMember inheritInnerMember = new InheritInnerMember(outerMember);
        
        OuterStatic outerStatic = new OuterStatic();
        OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
        //OuterStatic.InnerStatic innerStatic2 = outerStatic.new InnerStatic(); // nu putem crea cu o referinta catre o instanta a clasei outer

        int j = outerStatic.j;
             
    }
}