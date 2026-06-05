package interfacedemo;

// Q1. Write a Java program to create an interface Printable with a method print(). Implement the interface in a class and display the output.

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing Document...");
    }
}

public class PrintableDemo {
    public static void main(String[] args) {
        Printable p = new Document();
        p.print();
    }
}