package collectionframework;
/*
 * 
 * Maintains insertion order and allows duplicate and null values.
Dynamically grows its size when capacity is exceeded.
Implements List, RandomAccess, Cloneable, and Serializable interfaces.
Vector is a Legacy class that was introduced in early versions of Java.
Thread-safe: All methods are synchronized for safe multi-threaded access.
ArrayList is preferred over vector in general when in-built thread synchronization is not required..
 */

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
    Vector<String> vectordemo = new  Vector<String>();
    
    vectordemo.add(null);
    vectordemo.add("Orange");
    vectordemo.add("Orange");
    vectordemo.add("apple");
    System.out.println(vectordemo);
    

	}

}
