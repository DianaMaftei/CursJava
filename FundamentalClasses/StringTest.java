public class StringTest
{
    public static void main(String...args) {
        String s = "D";
        
        s+= "i";
        s+="a";
        s+="n";
        s+="a";
        
        String exists = s.intern();
        
        System.out.println(exists);
               
        String d = "Diana"; 
        String sss = "Diana";        
        String ss = new String("Diana");
        
        //System.out.println(d == s);
        //System.out.println(d == sss);
        //System.out.println(d == ss);
        //System.out.println(ss == sss);
        //System.out.println(s == ss);
        
        System.out.println("diana".equalsIgnoreCase("DiAna"));
        
        String[] arr = new String[1];
        int i = arr.length;
        "dinosaur".length();
        System.out.println("dinosaur".charAt(0));
        System.out.println("dinosaur".indexOf('s', 5));
        System.out.println("dinosaur".indexOf("s"));
        System.out.println("dinosaur".substring(4, 8));
        System.out.println("123DinOsaur324".toLowerCase());
        System.out.println("&%DinOsaur".toUpperCase());
        
        System.out.println("Java".startsWith("j"));
        System.out.println("Java".endsWith("a"));
        System.out.println("Java".contains("jav"));
        System.out.println("Java".replace("a", "o"));
        
        String initalString = "initial";
        //System.out.println(initalString.replace("i", "o"));
        //initalString = initalString.replace("i", "o");
        System.out.println(initalString);
        
        String untrimmed = "  trim me  ";
        System.out.println(untrimmed.trim() + "..");
    
        initalString = initalString.toUpperCase().substring(0, 5).replace("N", "t");
        System.out.print(initalString);
    }
}
