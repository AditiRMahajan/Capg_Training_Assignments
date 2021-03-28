import java.util.*;
/**
 * Converting every key value pair of the map into a string and append them all.
 * @author ADITI
 */
public class Lambda7 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("A", "D");
		map.put("I", "RM");
		map.put("E", "T");
		
		System.out.println("Hashmap before appending: "+map);
		
		//Use of StringBuilder and entrySet() for appending key-value pair into a string.
		StringBuilder sb = new StringBuilder();
		
		for(HashMap.Entry<String,String> h: map.entrySet()) {
	            String k = h.getKey();
	            String v = h.getValue();
	            sb.append(k).append(v);
	        }
		 
		 System.out.println("Hashmap after appending: "+sb);
		
	}

}
