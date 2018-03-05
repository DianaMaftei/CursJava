class InheritClass implements InterfaceWithInnerClass {
    
    public void access() {
        InterfaceWithInnerClass.Inner inner = new InterfaceWithInnerClass.Inner();
    }
}