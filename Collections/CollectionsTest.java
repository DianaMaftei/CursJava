import java.util.*;

public class CollectionsTest
{
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();
        
        //////////////// methods from Collection interface
        bookList.add("OCA guide");
        //System.out.println(bookList.add("OCA guide"));
        bookList.add("Ready Player One");
        //bookList.remove("OCA guide"); -> remove from Collection methods

        //System.out.println(bookList);
        //bookList.clear(); -> empties the list
        //System.out.println(bookList.contains("OCA guide"));
        //System.out.println(bookList.size()); // NOT length
        
        //////////////// methods from List interface
        bookList.add(2, "A Song of Fire And Ice");
        //System.out.println(bookList);
        //System.out.println(Collections.binarySearch(bookList, "A Song of Fire And Ice"));
        Collections.sort(bookList);
        Collections.binarySearch(bookList, "A Song of Fire And Ice");
        //System.out.println(bookList);
        //System.out.println(Collections.binarySearch(bookList, "A Song of Fire And Ice"));
        
        
        
        List<Elephant> elephants = new ArrayList<Elephant>();
        elephants.add(new Elephant("Dumbo"));
        elephants.add(new Elephant("richard"));
        elephants.add(new Elephant("Bob"));
        elephants.add(new Elephant("zulu"));
        elephants.add(new Elephant("Zulu"));
        System.out.println(elephants);
        //Collections.sort(elephants);
        Comparator<Elephant> e = new Comparator<Elephant>() {
            public int compare(Elephant one, Elephant two) {
                return two.name.length() - one.name.length();
            }
        };

        Collections.sort(elephants, (one, two) -> two.name.charAt(0) - one.name.charAt(0));
        System.out.println("new sort:" + elephants);
        
        //bookList.remove(1); -> remove from List methods
        String book = bookList.get(2);
        //System.out.println(book);
        //System.out.println(bookList.indexOf(book));
        String book2 = bookList.set(2, "Sapiens");
        //System.out.println(book2);
        //System.out.println(bookList);
        
        Set<String> bookSet = new TreeSet<>();
        
        bookSet.add("OCA guide");
        //System.out.println(bookSet.add("OCA guide"));
        bookSet.add("Ready Player One");
        bookSet.remove("OCA guide");
        //System.out.println(bookSet);
        //System.out.println(bookSet.size()); // NOT length
        
        //String[] books = {"book1", "book2"};
        //System.out.println(Arrays.toString(books));
        
        //////////////// methods from Map interface
        
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "mar");
        dictionary.put("apple", "fake apple");
        dictionary.put("pear", "para");
        //System.out.println(dictionary);   
        //System.out.println(dictionary.get("pear"));
        //dictionary.remove("pear");
        //System.out.println(dictionary.containsKey("pineapple"));
       //System.out.println(dictionary.containsValue("mar"));
       //System.out.println(dictionary);
       
       
       ///////////List Implementations
       //ArrayList
       //LinkedList -> also implements Queue
       List ls = new LinkedList(); // access just to list methods
       Queue qs = new LinkedList(); // access just to queue methods
       LinkedList ll = new LinkedList(); // access to methods from both list and queue
       
       // Set implementations
       //HashSet and TreeSet
       Set<String> stringHashSet = new HashSet<>();
       Set<String> stringTreeSet = new TreeSet<>();
       
       
       stringHashSet.add("red");
       stringHashSet.add("blue");
       stringHashSet.add("purple");
       stringHashSet.add("green");
       //System.out.println(stringHashSet);
              
       stringTreeSet.add("red");
       stringTreeSet.add("blue");
       stringTreeSet.add("purple");
       stringTreeSet.add("green");
       //System.out.println(stringTreeSet);
      // Queue Implementations
      ArrayDeque<Integer> numbers = new ArrayDeque<>();
      numbers.add(1);// throws exception
      numbers.add(2);
      numbers.add(3);
      
      numbers.offer(4); // doesn't throw exception
      numbers.offer(5);
      numbers.offer(6);
      
      
    
      //numbers.push(4);
      //numbers.push(5);
      //numbers.push(6);
      //System.out.println(numbers);
      numbers.remove();
      //System.out.println(numbers);
      numbers.poll();
      //System.out.println(numbers);
      numbers.pop();
      //System.out.println(numbers);
    }
}

class Elephant implements Comparable<Elephant> {
    public String name;
    
    Elephant(String name) {
        this.name = name;
    }
    
    public int compareTo(Elephant t) {
        // if they are equal = 0
        // if 1st is "smaller" than 2nd = negative number
        // if 1st is "bigger" than 2nd = positive number
        return this.name.length() - t.name.length();
    }
    
    public String toString() {
        return this.name;
    }
}
