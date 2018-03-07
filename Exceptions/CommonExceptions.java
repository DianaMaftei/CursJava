public class CommonExceptions
{
    public static void main(String[]  args) {
    // NullPointer
    String x = null;
    // x.length();
   
   // Arithmethic
   //int y = 10 / 0;
   
   // Index & ArrayIndexOOB
   String cat = "cat";
   //cat.charAt(3);
   
   String[] cats = new String[]{"fluffly"};
   
   //String myCat = cats[1];

   // ClassCast
   
   Object o = (Object) 1;
   //String s = (String) o;
   
   // IllegalArgumentException
   
   
   
   //NumberFormatException (with _ , +, - and base16)
   int mie = 1_000;
    int i = Integer.parseInt("112ABC", 16);
    System.out.println(i);
    }
    
   

}
