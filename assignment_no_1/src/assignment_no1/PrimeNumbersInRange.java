package assignment_no1;

// Q20. Write a Java program to display all prime numbers within a given range.
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean prime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime)
                    System.out.print(num + " ");
            }
        }
        
        sc.close();
    }
}