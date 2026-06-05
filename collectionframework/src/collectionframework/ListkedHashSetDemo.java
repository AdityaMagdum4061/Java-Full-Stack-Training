package collectionframework;
/*A LinkedHashSet is a collection 
 * that stores unique elements and 
 * remembers the order they were added.
 */

import java.util.LinkedHashSet;
import java.util.Set;
public class ListkedHashSetDemo {

	public static void main(String[] args) {
Set<String> linkedhashset =  new LinkedHashSet<String>();

linkedhashset.add(null);
linkedhashset.add("B");
linkedhashset.add("A");
linkedhashset.add("C");
System.out.println(linkedhashset);


	}

}
