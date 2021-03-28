import java.util.*;
import java.util.function.*;
/**
 * Creating string consist of first letter of each word in the list.
 * @author ADITI
 */
public class Lambda5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Aditi");
		list.add("Dipti");
		list.add("Imli");
		list.add("Tejas");
		list.add("Ishwar");
		
		System.out.println("List of Strings: "+list);
		
		//Use of stringbuilder to concate resulting string
		StringBuilder sb = new StringBuilder();
		
		//Use of Consumer interface to get first letter of each word
		Consumer<String> resultStr = r -> sb.append(r.charAt(0));
		
		for(String str: list) {
			resultStr.accept(str);
		}
		
		System.out.println("Resulting String after concatenating first letters: "+sb);
	}

}
