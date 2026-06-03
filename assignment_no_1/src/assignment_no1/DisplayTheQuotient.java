// 5. Write a Java program to divide two numbers and display the quotient.

package assignment_no1;

import java.util.Scanner;

public class DisplayTheQuotient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double quotient = a / b;

        System.out.println("Quotient = " + quotient);
        
        sc.close();
    }
}