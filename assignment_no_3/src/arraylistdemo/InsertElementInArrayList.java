package arraylistdemo;

// Q4. Write a Java program to insert an element at a specific position in an ArrayList.

import java.util.ArrayList;

public class InsertElementInArrayList {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");

        languages.add(1, "Python");

        System.out.println(languages);
    }
}