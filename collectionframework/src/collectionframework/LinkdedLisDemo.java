package collectionframework;

import java.util.LinkedList;
import java.util.List;

/*Linked List:

Data Structure: Non-contiguous
Memory Allocation: Typically allocated one by one to individual elements
Insertion/Deletion: Efficient
Access: Sequential
*/

public class LinkdedLisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new LinkedList<String>();
		
		list.add(null);
		list.add("orange");
		list.add("orange");
		list.add("apple");
		
		System.out.println(list);

	}

}
