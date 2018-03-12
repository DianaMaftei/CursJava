public class ExceptionExample
{
    public static void main(String[] args) {
        //System.out.println(getInt());
        System.out.println(getTestObject().i);
        int x = 1_000_000;
        String s = "1_000_000";
        String ss = "123abc";
        int i = Integer.parseInt(ss, 16);
        System.out.println(i);
    }
    
    public static int getInt() {
        int intValue = 10;
        
        try{
            System.out.println(intValue);
            return ++intValue;
            //throw new Exception();
        } catch (Exception e) {
            System.out.println("in catch :" +intValue);
            return intValue;
        } finally {
            intValue += 10;
            System.out.println("in finally :" + intValue);
            //return intValue;
        }
        
        //return intValue;
    }
    
    public static TestObject getTestObject() {
        TestObject to = new TestObject();
        
        try{
            System.out.println(to.i);
            throw new Exception();
        } catch (Exception e) {
            System.out.println("in catch :" + to.i);
            return to;
        } finally {
            to.i = 25;
            System.out.println("in finally :" +  to.i);
            //return intValue;
        }
        
        //return intValue;
    }
    
    
}
