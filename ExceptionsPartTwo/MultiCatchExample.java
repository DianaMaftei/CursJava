public class MultiCatchExample
{
    public static void main(String[] args) {
    
        try {
            // do something
        } catch(ClassCastException | IllegalArgumentException | ArrayIndexOutOfBoundsException exc) {
            // un singur nume de variablila
        } 
        //catch(RuntimeException e){
            //e = new NullPointerException();
        //} 
        catch (NullPointerException | ArithmeticException e) {
            if(e instanceof NullPointerException) {            
                e = new NullPointerException();
            } else if(e instanceof ArithmeticException) {            
                e = new ArithmeticException();
            }

        }
        //catch(ArrayIndexOutOfBoundsException | IndexOutOfBoundsException exc) {
            // nu pot fi inrudite
        //}
        
        
    }
}
