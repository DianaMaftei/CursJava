public class Container {
    private Object contents;
    
    public Object emptyContainer() {
        return contents;
    }
    
    public void packContainer(Object o) {
        this.contents = o;
    }
    
}

class TestContainer {
    public static void main(String... args) {
        
        Container e = new Container();
        e.packContainer(new Elephant());
        
        Container b = new Container();
        b.packContainer(new Book());
    
    }
}

