package arraylistdemo;

// Q2. Write a Java program to create an ArrayList of student names and display all names.

import java.util.ArrayList;

public class StudentNamesArrayList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Aditya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Sneha");
        students.add("Amit");

        for (String name : students) {
            System.out.println(name);
        }
    }
}