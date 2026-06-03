package assignment_no1;

// Q25. Write a Java program to count the number of digits in a number.
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.println("Number of Digits = " + count);
        
        sc.close();
    }
}