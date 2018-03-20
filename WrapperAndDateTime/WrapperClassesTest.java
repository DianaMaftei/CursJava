public class WrapperClassesTest
{
    public static void main(String[] args) {
        Integer i = 12;
        Integer j = new Integer(12);
        Integer k = Integer.valueOf(12);
        Integer l = Integer.valueOf("12");
        int w = Integer.parseInt("10");
        
        //Integer e = new Integer();
        l += 10;
        
        Boolean b = new Boolean(true);
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("tralala");
        
        //System.out.println(b1);
        //System.out.println(b2);
        Boolean b3 = Boolean.TRUE;
        Boolean b4 = Boolean.FALSE;
        
        System.out.println(b == b1);
        System.out.println(b3 == b1);
        
        Character c = Character.valueOf('a');
        Character cc = new Character('a');
        
        byte myByte = k.byteValue();
        long myLong = k.longValue();
        
        //System.out.println(myByte);
        
        //System.out.println(k == j);
        //System.out.println(k == i);
        
        Integer n = Integer.valueOf(null);
        
        //System.out.println(n);
        
        Integer m = Integer.parseInt(null);
        //System.out.println(m);
        
        Integer nullI = new Integer(null);
        System.out.println(nullI);
    }
}
