package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();

		list.add(null);
		list.add("Apple");
		list.add("Apple");
		list.add("Orange");

		System.out.println(list);

	}

}
