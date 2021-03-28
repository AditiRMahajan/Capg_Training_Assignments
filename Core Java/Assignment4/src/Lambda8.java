import java.util.*;
import java.util.function.*;
/**
 * Print the numbers using class thread and consumer interface.
 * @author ADITI
 */
public class Lambda8 {
    public static void main(String[] args) {  
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);   
        
        Consumer<List<Integer>> thread = l -> new Thread(() -> l.forEach(System.out::println)).run();

        thread.accept(list);
    }
    
}
