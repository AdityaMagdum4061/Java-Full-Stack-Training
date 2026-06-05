package arraylistdemo;

// Q3. Write a Java program to add five city names into an ArrayList and print the size of the list.

import java.util.ArrayList;

public class CityArrayListSize {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Nashik");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nagpur");
        cities.add("Aurangabad");

        System.out.println("Size of List: " + cities.size());
    }
}