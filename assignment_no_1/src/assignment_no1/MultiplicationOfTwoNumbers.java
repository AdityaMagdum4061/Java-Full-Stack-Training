// 4.Write a Java program to multiply two numbers.

package assignment_no1;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Numbers : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second Numbers : ");
		int n2 = sc.nextInt();
		
		int mult = n1 * n2;
		
		System.out.println("Multiplication of "+n1+" and "+n2+" is : "+mult);
		
		sc.close();

	}

}
