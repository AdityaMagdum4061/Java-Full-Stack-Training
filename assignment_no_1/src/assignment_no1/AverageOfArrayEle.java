package assignment_no1;

// Q30. Write a Java program to calculate the average of array elements.
import java.util.Scanner;

public class AverageOfArrayEle {
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

        double average = (double) sum / n;

        System.out.println("Average = " + average);
        
        sc.close();
    }
}