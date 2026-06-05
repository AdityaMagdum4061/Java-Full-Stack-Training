package arraylistdemo;

// Q1. Write a Java program to create an ArrayList of integers and add 10 numbers to it. Display all elements using a for-each loop.

import java.util.ArrayList;

public class IntegerArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}