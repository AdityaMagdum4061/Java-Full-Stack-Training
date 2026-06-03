package assignment_no1;

// Q6. Write a Java program to find the remainder of two numbers.
import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int remainder = num1 % num2;

        System.out.println("Remainder = " + remainder);
        
        sc.close();
    }
}