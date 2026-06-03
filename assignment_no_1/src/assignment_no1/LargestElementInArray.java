package assignment_no1;

// Q27. Write a Java program to find the largest element in an array.
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        System.out.println("Largest Element = " + largest);
        
        sc.close();
    }
}