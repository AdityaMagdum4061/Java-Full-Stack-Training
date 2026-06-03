package assignment_no1;

// Q26. Write a Java program to calculate the power of a number.
import java.util.Scanner;

public class PowerOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
        
        sc.close();
    }
}