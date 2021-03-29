
import java.util.*;  
public class CF3 {
    public static void main(String[] args) {
    	//Create Array list
        ArrayList<String> arrlist = new ArrayList<String>();
        
        //Add elements to ArrayList
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");
        
        //Using ListIterator 
        ListIterator<String> iterator = arrlist.listIterator();
        
        //Iterate
        while (iterator.hasNext()) {
            iterator.next();
         }
        
        //print in reverse direction
        System.out.println("\nElements in backward direction using ListIterator are:\n");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
         }
    }
}