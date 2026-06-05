package collectionframework;

import java.util.TreeSet;

/*
 * A TreeSet is a collection that stores
 *  unique elements in sorted order.
 * 
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeset =  new TreeSet<Integer>();
		
		treeset.add(34);
		treeset.add(20);
		treeset.add(2);
		treeset.add(1);
		System.out.print(treeset);
		
		
		

	}

}
