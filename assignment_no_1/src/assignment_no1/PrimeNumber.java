package assignment_no1;

// Q19. Write a Java program to check whether a number is a prime number.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
        
        sc.close();
    }
}