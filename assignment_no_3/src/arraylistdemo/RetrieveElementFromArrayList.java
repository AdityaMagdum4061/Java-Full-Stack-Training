package arraylistdemo;

// Q5. Write a Java program to retrieve an element from an ArrayList using its index.

import java.util.ArrayList;

public class RetrieveElementFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        String element = fruits.get(2);

        System.out.println("Element at Index 2: " + element);
    }
}