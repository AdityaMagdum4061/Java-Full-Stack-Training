package abstractclassdemo;

// Q1. Write a Java program to create an abstract class Shape with an abstract method calculateArea() and implement it in Circle and Rectangle classes.

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.calculateArea();
        s2.calculateArea();
    }
}