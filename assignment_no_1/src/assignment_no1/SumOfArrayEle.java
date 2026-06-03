package assignment_no1;

// Q29. Write a Java program to calculate the sum of all elements in an array.
import java.util.Scanner;

public class SumOfArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
        
        sc.close();
    }
}