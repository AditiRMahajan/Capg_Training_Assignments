import java.util.*; 

public class CF2 {
    public static void main(String[] args) {
    	// create a hash set
        HashSet<String> h=new HashSet<>();  
        // add elements to the hash set
        h.add("Apple");
        h.add("Ball");
        h.add("Cat");
        h.add("Dog");
        h.add("Elephant");
        //elements will be printed in unordered manner
        System.out.println("Unorderd set:"+h);
        
       // create a linked hash set
        LinkedHashSet<String> l = new LinkedHashSet<>();  
        // add elements to the linked hash set
        l.add("Apple");
        l.add("Ball");
        l.add("Cat");
        l.add("Dog");
        l.add("Elephant");
      //elements will be printed in ordered manner
        System.out.println("Ordered set:"+l);
    }
}