package collectionframework;
/*
 * The Set interface is part of the Java Collections
 *  Framework and is used to store a collection of unique elements.

Unlike a List, a Set does not allow duplicates,
 and it does not preserve the order of elements
  (unless you're using TreeSet or LinkedHashSet).
 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set =  new HashSet<String>();
		
		set.add(null);
		set.add("orange");
		set.add("orange");
		set.add("apple");
		set.add("mango");
		set.add("papaya");
		
		System.out.println(set);
		

	}

}
