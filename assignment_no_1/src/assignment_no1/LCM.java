package assignment_no1;

// Q24. Write a Java program to find the least common multiple (LCM) of two numbers.
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int lcm = (a * b) / x;

        System.out.println("LCM = " + lcm);
        
        sc.close();
    }
}