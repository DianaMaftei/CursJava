public class OuterStatic {

    private int i ;
    public static int j;
    
    public int getI() {
        return i;
    }
    
    public static int sum(int i, int j) {
        return i + j;
    }
   
    static class InnerStatic {
    
        public void access() {
            //int w = i + 1; // din clasa statica nu putem accesa campuri non-statice
            // getI();      // din clasa statica nu putem accesa metode non-statice
            sum(2, 3); // putem accesa o metoda statica 
            int q = j +1; // putem accesa un camp static
        }
    }

}