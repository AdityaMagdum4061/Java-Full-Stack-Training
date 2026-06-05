package collectionframework;

import java.util.HashMap;
import java.util.Map;

/*A HashMap stores items in key/value pairs,
 *  where each key maps to a specific value.

It is part of the java.util package and 
implements the Map interface.
*/
public class HashMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Aditya");
		map.put(2, "Parth");
		map.put(3, "Pratik");
		map.put(4, "Pruthviraj");
		
		System.out.println(map);
		
	
	
	}

}
