package assignment_no1;

// Q9. Write a Java program to check whether a number is even or odd.
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
        
        sc.close();
    }
}