package assignment_no1;

// Q7. Write a Java program to find the largest of two numbers.
import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Largest Number = " + a);
        else
            System.out.println("Largest Number = " + b);
        
        sc.close();
    }
}