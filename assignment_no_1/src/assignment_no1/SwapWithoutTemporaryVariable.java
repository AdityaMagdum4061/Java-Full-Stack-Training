package assignment_no1;

// Q12. Write a Java program to swap two numbers without using a temporary variable.
import java.util.Scanner;

public class SwapWithoutTemporaryVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);
        
        sc.close();
    }
}