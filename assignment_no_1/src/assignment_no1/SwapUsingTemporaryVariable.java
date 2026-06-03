package assignment_no1;

// Q11. Write a Java program to swap two numbers using a temporary variable.
import java.util.Scanner;

public class SwapUsingTemporaryVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);
        
        sc.close();
    }
}