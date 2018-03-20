public class GenericContainer<T, U> {
    
    private T contents;
    //private static T contentsStatic;
    private U weight;
    
    public T emptyContainer() {
        // new T();
        return contents;
    }
    
    public void packContainer(T o) {
        //
        this.contents = o;
    }
    
}


