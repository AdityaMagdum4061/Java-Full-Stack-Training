package assignment_no1;

// Q28. Write a Java program to find the smallest element in an array.
import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Smallest Element = " + smallest);
        
        sc.close();
    }
}