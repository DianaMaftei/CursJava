public class StringBuilderTest
{
   public static void main(String...args) {
       StringBuilder sb = new StringBuilder();
       StringBuilder sb1 = new StringBuilder("dino");
       StringBuilder sb2 = new StringBuilder(300);
       
       sb.append("saur");
       
       System.out.println(sb);
       
       sb.insert(0, "good ");
       System.out.println(sb);
       sb.delete(0, 5);
       System.out.println(sb);
       sb.replace(0, 1, "b");
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);
       String sub = sb.substring(0, 6).trim();
       System.out.println(sub);
       System.out.println(sb);
    }
}
