// 3.Write a Java program to subtract two numbers.

package assignment_no1;

import java.util.Scanner;

public class SubstractionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Numbers : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second Numbers : ");
		int n2 = sc.nextInt();
		
		int sub = n1 - n2;
		
		System.out.println("Substraction of "+n1+" and "+n2+" is : "+sub);
		
		sc.close();

	}

}
