import java.util.*;
/**
 * Removing odd lenghts from list using removeIf()
 * @author ADITI
 *
 */
public class Lambda4 {
	public static void main(String[] args) {
		//Create list and add elements
		ArrayList<String> list = new ArrayList<>();
		list.add("Aditi");
		list.add("Anusha");
		list.add("Keshav");
		list.add("Aishwarya");
		
		System.out.println("List before removing odd lengths: "+list);
		
		//Apply removeIf() method
		list.removeIf(l -> l.length()%2!=0);
		System.out.println("List after removing odd lengths: "+list);
		
	}

}
