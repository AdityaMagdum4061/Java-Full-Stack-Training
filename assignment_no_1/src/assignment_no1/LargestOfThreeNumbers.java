package assignment_no1;

// Q8. Write a Java program to find the largest of three numbers.
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = a;

        if (b > largest)
            largest = b;

        if (c > largest)
            largest = c;

        System.out.println("Largest Number = " + largest);
        
        sc.close();
    }
}