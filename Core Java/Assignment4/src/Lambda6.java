import java.util.*;
import java.util.function.*;
/**
 * Replacing every word in the list with its upper case equivalent.
 * @author ADITI
 */
public class Lambda6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("My");
		list.add("name");
		list.add("is");
		list.add("Aditi");
		
		System.out.println("List before UpperCasing: "+list);
		
		//Use of UnaryOperator to convert words into uppercase
		UnaryOperator<String> upper = u -> u.toUpperCase();
		
		//Use of replaceAll() method to replace all the words of list
		list.replaceAll(upper);
		
		System.out.println("List after UpperCasing: "+list);
		
	}

}
