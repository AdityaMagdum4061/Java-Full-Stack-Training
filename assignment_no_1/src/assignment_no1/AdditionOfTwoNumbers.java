// 2.Write a Java program to add two numbers and display the result.
package assignment_no1;

import java.util.Scanner;
	
public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Numbers : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second Numbers : ");
		int n2 = sc.nextInt();
		
		int sum = n1 + n2;
		
		System.out.println("Addition of "+n1+" and "+n2+" is : "+sum);
		
		sc.close();
	}

}
