package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

//A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
//It is part of the java.util package and implements the Map interface.

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Aditya");
		linkedhashmap.put(2, "Parth");
		linkedhashmap.put(3, "Pratik");
		linkedhashmap.put(4, "Pruthviraj");
		
		System.out.println(linkedhashmap);
	}

}